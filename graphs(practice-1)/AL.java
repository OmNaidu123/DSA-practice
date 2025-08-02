import java.util.*;
/**
 * Write a description of AL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AL {
    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[4];
        AL mainb = new AL();
        mainb.createGraph(graph);
        System.out.println("created");
        System.out.print("bfs: ");
        mainb.bfs(graph);
        boolean vis[] = new boolean[V];
        System.out.println("dfs: ");
        for(int i = 0; i < V; i++){
            if(vis[i]==false){
                mainb.dfs(graph,i,vis);
            }
        }
        int V2 = 7;
        System.out.println();
        System.out.println("all paths from 0 to 5: ");
        ArrayList<Edge> graph2[] = new ArrayList[V2];
        mainb.createGraph2(graph2);
        boolean vis2[] = new boolean[V2];
        mainb.pathfinder(graph2,0,vis2,"",5);
        System.out.println();
        int V3 = 7;
        ArrayList<Edge> graph3[] = new ArrayList[V3];
        mainb.createGraph3(graph3);
        boolean vis3[] = new boolean[V3];
        boolean rec[] = new boolean[V3];
        boolean cycleChecker = mainb.findCycle(graph3,vis3,rec,0);
        System.out.println("is cycle present?: "+cycleChecker);
        boolean vis3_1[] = new boolean[V3];
        Stack<Integer> stack =  new Stack<>();
        for(int i = 0; i < V3; i++){
            if(vis3_1[i]==false){
                mainb.topologicalSort(graph3,vis3_1,stack,i);   
            }
        }
        System.out.print("topological order: ");
        while(stack.isEmpty()==false){
            System.out.print(stack.pop()+"->");
        }
        System.out.println();
        boolean cycleC = mainb.findCycleUD(graph, new boolean[V],0,-1);
        System.out.println("cycle present?: "+cycleC);
        
    }
    void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3)); 
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    void createGraph2(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3)); 
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));
    }
    void createGraph3(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3)); 
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,6));
        //graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,6));
    }
    void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean vis[] = new boolean[graph.length];
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    q.add(graph[curr].get(i).dest);
                }
            }
        }
    }
    void dfs(ArrayList<Edge> graph[], int e, boolean vis[]){
        if(vis[e] == false){
            System.out.print(e+" ");
            vis[e] = true;
            for(int i = 0; i < graph[e].size(); i++){
                dfs(graph,graph[e].get(i).dest,vis);   
            }
        }
    }
    void pathfinder(ArrayList<Edge> graph[], int e, boolean vis[], String path, int target){
        if(e==target){
            path = path + " " + Integer.toString(e);
            System.out.println(path);
            return;
        }
        if(vis[e] == false){
            path = path + " " + Integer.toString(e);
            vis[e] = true;
            for(int i = 0; i < graph[e].size(); i++){
                pathfinder(graph,graph[e].get(i).dest,vis,path,target);   
            }
            vis[e] = false;
        }
    }
    boolean findCycle(ArrayList<Edge> graph[], boolean vis[], boolean rec[], int e){
        boolean check = false;
        if(vis[e]==false){
            vis[e] = true;
            rec[e] = true;
            for(int i = 0; i < graph[e].size(); i++){
                int ed = graph[e].get(i).dest;
                if(rec[ed]==true){
                    return true;
                }
                else{
                    check = findCycle(graph,vis,rec,ed);
                    if(check==true) 
                        return check;
                }
            }
            rec[e] = false;
        }
        return check;
    }
    void topologicalSort(ArrayList<Edge> graph[], boolean vis[], Stack<Integer> stack, int curr){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            int next = graph[curr].get(i).dest;
            if(vis[next]==false)
             topologicalSort(graph,vis,stack,next);
        }
        stack.push(curr);
    }
    boolean findCycleUD(ArrayList<Edge> graph[], boolean vis[], int curr, int par){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            int next = graph[curr].get(i).dest;
            if(next!=par && vis[next]==true)
                return true;
            else if(vis[next] == false){    
                if(findCycleUD(graph,vis,next,curr))
                    return true;
            }    
        }
        return false;
    }
}
class Edge{
    int src;
    int dest;
    Edge(int s, int d){
        src = s;
        dest = d;
    }
}
