//code for checking if a cycle is present in the graph
import java.util.*;
/**
 * Write a description of CD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class node{
 int src;
 int des;
 node(int src, int des){
     this.src = src;
     this.des = des;
 }
}
public class CD {
    public static void main(String[] args){
        int V = 4;
        ArrayList<node> graph[] = new ArrayList[V];
        creator(graph,V);
        boolean[] vis = new boolean[V];
        boolean[] rec = new boolean[V];
        for(int i = 0; i < V; i++){
         vis[i]=false;
         rec[i]=false;
        }
        for(int i = 0; i < V; i++){
         if(vis[i]==false){
             boolean cyc = cycdfs(graph,vis,rec,i);
             System.out.println("cycle present in graph?(if present: true, if not present: false): "+cyc);
         }
        }
    }
    public static void creator(ArrayList<node> graph[], int V){
        for(int i = 0; i < V; i++){
            graph[i]= new ArrayList<node>();
        }
        graph[0].add(new node(0,2));
        graph[1].add(new node(1,0));
        graph[2].add(new node(2,3));
        graph[3].add(new node(3,0));
    }
    public static boolean cycdfs(ArrayList<node> graph[], boolean[] vis, boolean[] rec, int curr){//cycle checker
        vis[curr]=true;
        rec[curr]=true;
        boolean cyc = false;
        for(int i = 0; i < graph[curr].size(); i++){
            int e = graph[curr].get(i).des;
            if(rec[e]==true)
             return true;
            else if(vis[e]==false)
             cyc = cycdfs(graph,vis,rec,e);
        }
        rec[curr]=false;
        return cyc;
    }
}
