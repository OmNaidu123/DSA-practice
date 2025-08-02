import java.util.*;
/**
 * Write a description of AL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AL {
 static class edge{
     int source;
     int destination;
     edge(int s, int d){
         source = s;
         destination = d;
     }
 }
 public static void create(ArrayList<edge> graph[]){ //creating the graph
     for(int i = 0; i < graph.length; i++){
         graph[i] = new ArrayList<edge>();
     }
     graph[0].add(new edge(0,2));
     graph[1].add(new edge(1,2));
     graph[1].add(new edge(1,3));
     graph[2].add(new edge(2,0));
     graph[2].add(new edge(2,1));
     graph[2].add(new edge(2,3));
     graph[3].add(new edge(3,1));
     graph[3].add(new edge(3,2));
 }
 public static void main(String[] Args){
     int V = 4;
     ArrayList<edge> graph[] = new ArrayList[V];
     create(graph);
     //printing 2's neighbours
     for(int i = 0; i<graph[2].size(); i++){
         edge e = graph[2].get(i);
         int dest = e.destination;
         System.out.print(dest + " ");
     }
     System.out.println();
 }
}
