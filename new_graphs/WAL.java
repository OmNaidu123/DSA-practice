//creating a graph using adjacency list method with weights
import java.util.*; 
/**
 * Write a description of AL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WAL {
 static class Edge{
     int src;
     int dest;
     int wt;
     Edge(int s, int d, int w){
         this.src = s;
         this.dest = d;
         this.wt = w;
     }
 }
 static void Nidentiyer(ArrayList<Edge> graph[],int V){//finding neibhours of a given vertex
      System.out.println("neighbours of "+V+ " :");
      for(int i = 0; i < graph[V].size(); i++){
          int n = graph[V].get(i).dest;
          System.out.println(n);
      }
 }
 static void creator(ArrayList<Edge> graph[],int V){
     for(int i = 0; i<V; i++){
         graph[i] = new ArrayList<Edge>();
     }
     graph[0].add(new Edge(0,2,2));
     graph[1].add(new Edge(1,2,10));
     graph[1].add(new Edge(1,3,0));
     graph[2].add(new Edge(2,0,2));
     graph[2].add(new Edge(2,1,10));
     graph[2].add(new Edge(2,3,-1));
     graph[3].add(new Edge(3,1,0));
     graph[3].add(new Edge(3,2,-1));
 }
 public static void main(String[] Args){
     int V = 4;
     ArrayList<Edge> graph[] = new ArrayList[V];
     //creating a graph
     creator(graph,V);
     //displaying the neighbours of 2
     Nidentiyer(graph,2);
 }
}