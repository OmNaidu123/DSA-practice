//using topological sort
import java.util.*;
/**
 * Write a description of TS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TS {
 static Stack<Integer> stack = new Stack<Integer>();
 static class Edge{
     int src;
     int des;
     Edge(int s, int d){
         src=s;
         des=d;
     }
 }
  static void creator(ArrayList<Edge> graph[],int V){
     for(int i = 0; i<V; i++){
         graph[i] = new ArrayList<Edge>();
     }
     graph[2].add(new Edge(2,3));
     graph[3].add(new Edge(3,1));
     graph[4].add(new Edge(4,0));
     graph[4].add(new Edge(4,1));
     graph[5].add(new Edge(5,0));
     graph[4].add(new Edge(5,2));
 }
 public static void main(String[] Args){
     int V = 6;
     ArrayList<Edge> graph[] = new ArrayList[V];
     creator(graph,V);
     boolean[] vis = new boolean[V];
     for(int i = 0; i < V; i++)
      vis[i]=false;
     for(int i = 0; i < V; i++){
         if(vis[i]==false)
          topsort(vis,i,graph);
     }
     System.out.print("the topological order of the given graph is: ");
     while(!stack.isEmpty())
         System.out.print(stack.pop()+" ");
     System.out.println();
 }
 public static void topsort(boolean[] vis, int curr, ArrayList<Edge> graph[]){//performing topological sort
     vis[curr]=true;
     for(int i = 0; i < graph[curr].size(); i++){
         int e = graph[curr].get(i).des;
         if(vis[e]==false){
             topsort(vis,e,graph);
         }
     }
     stack.push(curr);
 }
}
