import java.util.*;
/**
 * Write a description of TJ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TJ {
    static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
    }
    static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis, int[] dst, int[] low, int par, int time){
        dst[curr] = low[curr] = ++time;
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(e.dest == par) continue;
            else if(!vis[e.dest]){
                dfs(graph,e.dest,vis,dst,low,curr,time);
                low[curr] = Math.min(low[curr],low[e.dest]);
                if(dst[curr]<low[e.dest]){
                    System.out.println("bridge: "+curr+"-----"+e.dest);
                }
            }
            else{
                low[curr] = Math.min(low[curr],dst[e.dest]);
            }
        }
    }
    static void tarjan(ArrayList<Edge> graph[], int V){//used for finding bridges
        int[] dst = new int[V];
        int[] low = new int[V];
        boolean[] vis  = new boolean[V];
        int time = 0;
        for(int i = 0; i < V; i++){
            if(!vis[i]) dfs(graph,i,vis,dst,low,-1,time);
        }
    }
    static void dfs2(ArrayList<Edge> graph[], int curr, int par, int time, int[] dst, int[] low, boolean[] vis, boolean[] ap){
        vis[curr] = true;
        dst[curr] = low[curr] = ++time;
        int children = 0;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if(neigh==par) continue;
            else if(vis[neigh]) low[curr] = Math.min(low[curr],dst[neigh]);
            else{//(!vis[neigh])
                dfs2(graph,neigh,curr,time,dst,low,vis,ap);
                low[curr] = Math.min(low[curr],low[neigh]);
                if(dst[curr]<=low[neigh] && par!=-1) ap[curr]=true;
                children++;
            }
        }
        if(par==-1 && children>1)
         ap[curr] = true;
    }
    static void tarjan2(ArrayList<Edge> graph[], int V){//used for finding articulation points
        int[] dst = new int[V];
        int[] low = new int[V];
        boolean[] vis = new boolean[V];
        boolean[] ap = new boolean[V];
        int time = 0;
        for(int i = 0; i<V; i++){
            if(!vis[i]) dfs2(graph,i,-1,time,dst,low,vis,ap);
        }
        for(int i = 0; i < V; i++){
            if(ap[i]) System.out.println("ap: "+i);
        }
    }
    public static void main(String[] args){
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjan(graph,V);
        tarjan2(graph,V);
    }
}
