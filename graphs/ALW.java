import java.util.*;
/**
 * Write a description of AL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ALW {
 static class edge{
     int source;
     int destination;
     int weight;
     edge(int s, int d, int w){
         source = s;
         destination = d;
         weight = w;
     }
 }
 public static void create(ArrayList<edge> graph[]){ //creating the graph
     for(int i = 0; i < graph.length; i++){
         graph[i] = new ArrayList<edge>();
     }
     graph[0].add(new edge(0,2,5));
     graph[1].add(new edge(1,2,10));
     graph[1].add(new edge(1,3,20));
     graph[2].add(new edge(2,0,5));
     graph[2].add(new edge(2,1,10));
     graph[2].add(new edge(2,3,15));
     graph[3].add(new edge(3,1,20));
     graph[3].add(new edge(3,2,15));
 }
 public static void main(String[] Args){
     int V = 4;
     ArrayList<edge> graph[] = new ArrayList[V];
     create(graph);
     //printing 2's neighbours, weight
     for(int i = 0; i<graph[2].size(); i++){
         edge e = graph[2].get(i);
         int dest = e.destination;
         int wt = e.weight;
         System.out.print(dest + " weight: " + wt + ", ");
     }
     System.out.println();
 }
}