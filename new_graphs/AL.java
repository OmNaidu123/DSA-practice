//creating a graph using adjacency list method
import java.util.*; 
/**
 * Write a description of AL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AL {
 static class Edge{
     int src;
     int dest;
     Edge(int s, int d){
         this.src = s;
         this.dest = d;
     }
 }
 static void Nidentiyer(ArrayList<Edge> graph[],int V){//finding neibhours of a given vertex
      System.out.println("neighbours of "+V+ " :");
      for(int i = 0; i < graph[V].size(); i++){
          int n = graph[V].get(i).dest;
          System.out.println(n);
      }
 }
 static void bfs(ArrayList<Edge> graph[], int V){//finding breath first traversal
     Queue<Integer> q = new LinkedList<Integer>();
     boolean[] vis = new boolean[V];
     for(int i = 0; i < V; i++)
      vis[i] = false;
     q.add(0);
     System.out.println("the bfs of the given graph is:");
    while(!q.isEmpty()){
     while(q.isEmpty()==false){
     if(vis[q.peek()] == false){
         vis[q.peek()] = true;
         int v = q.remove();
         System.out.print(v + ", ");
         for(int i = 0; i < graph[v].size(); i++){
             Edge e = graph[v].get(i);
             q.add(e.dest);
         }
     }
     else
      q.remove();
    }
    for(int i = 0; i < V; i++){
        if(vis[i] == false){
            q.add(i);
        }
    }
   }
 }
  static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis){//finding depth first traversal
      if(vis[curr] == false){
          vis[curr] = true;
          System.out.print(curr + ", ");
          for(int i = 0; i < graph[curr].size(); i++){
              Edge e = graph[curr].get(i);
              dfs(graph,e.dest,vis);
          }
      }
 }
 static void creator(ArrayList<Edge> graph[],int V){
     for(int i = 0; i<V; i++){
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
     graph[4].add(new Edge(4,5));
     graph[5].add(new Edge(5,4));
 }
 public static void main(String[] Args){
     int V = 6;
     ArrayList<Edge> graph[] = new ArrayList[V];
     //creating a graph
     creator(graph,V);
     //displaying the neighbours of 2
     Nidentiyer(graph,2);
     //displaying breath first traversal
     bfs(graph,V);
     System.out.println();
     //displaying depth first traversal
     boolean[] vis = new boolean[V];
    for(int i = 0; i < V; i++)
      vis[i] = false;
     System.out.println("the dfs of the given graph is:");
     for(int i = 0; i < V; i++){
     if(vis[i] == false){
      dfs(graph,i,vis);
     }
    }
     System.out.println();  
 }
}
