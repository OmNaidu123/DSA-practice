import java.util.*;
/**
 * Write a description of dikstra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dikstra {
    static void createGraph(ArrayList<Edge> graph[]) {//for dikstras and bellmanfords
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
}
    static void createGraph2(ArrayList<Edge> graph[]) {//for prims
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
}
static class Pair implements Comparable<Pair> {
    int n;
    int path;
    public Pair(int n, int path) {
        this.n = n;
        this.path = path;
    }
    @Override
    public int compareTo(Pair p2) {
        return this.path - p2.path;
    }
}
public static int[] dijkstra(ArrayList<Edge> graph[], int src) {//dijkstra's algorithm
    boolean[] vis = new boolean[graph.length];
    PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
    int[] dis = new int[graph.length];
    for(int i =0; i < dis.length; i++){
        if(src!=i) dis[i] = Integer.MAX_VALUE;
    }
    pq.add(new Pair(src,0));
    while(!pq.isEmpty()){
        Pair curr = pq.remove();
        if(!vis[curr.n]){
            vis[curr.n] = true;
            for(int i = 0; i < graph[curr.n].size(); i++){
                Edge ed = graph[curr.n].get(i);
                int from = ed.src;
                int to = ed.dest;
                if(!vis[to] && dis[from] + ed.wt < dis[to]){
                 dis[to] = dis[from] + ed.wt;
                 pq.add(new Pair(to,dis[to]));
            }
        }
        }
    }
    return dis;
}
public static void bellFord(ArrayList<Edge> graph[], int src){
    int[] dis = new int[graph.length];
    for(int i = 0; i < dis.length; i++){
        if(i!=src) dis[i] = Integer.MAX_VALUE;
    }
    dis[src] = 0;
    for(int k = 0; k < graph.length; k++){
        int[] temp = new int[dis.length];
        for(int i = 0; i < dis.length; i++)
         temp[i] = dis[i];
        for(int i = 0; i<graph.length; i++){
            for(int j = 0; j<graph[i].size(); j++){
                Edge ed = graph[i].get(j);
                int from = ed.src;
                int to = ed.dest;
                int wt = ed.wt;
                if(dis[from]!= Integer.MAX_VALUE && dis[from]+wt<temp[to])
                 temp[to] = dis[from]+wt;
            }
        }
        dis = temp;
    }
    for(int i = 0; i < dis.length; i++){
        System.out.print(dis[i]+" ");
    }
}
static class Pair2 implements Comparable<Pair2> {
    int node;
    int cost;
    public Pair2(int n, int c) {
        this.node = n;
        this.cost = c;
    }
    @Override
    public int compareTo(Pair2 p2) {
        return this.cost - p2.cost;
    }
}
public static ArrayList<Edge> prims(ArrayList<Edge> graph[]){//prim's alogorithm for MSTs
    boolean vis[] = new boolean[graph.length];
    PriorityQueue<Pair2> pq = new PriorityQueue<Pair2>();
    pq.add(new Pair2(0,0));
    ArrayList<Edge> ans = new ArrayList<Edge>();
    int cost=0;
    while(!pq.isEmpty()){
        Pair2 curr = pq.remove();
        if(!vis[curr.node]){
            vis[curr.node] = true;
            cost = cost + curr.cost;
            for(int i = 0; i < graph[curr.node].size(); i++){
                Edge ed = graph[curr.node].get(i);
                if(!vis[ed.dest])
                    pq.add(new Pair2(ed.dest,ed.wt));
                if(vis[ed.dest] && ed.wt == curr.cost){
                    ans.add(new Edge(ed.dest,curr.node,curr.cost));
                }
            }
        }
    }
    System.out.println("cost of MST: "+cost);
    return ans;
}
public static void main(String args[]) {
    int V = 6;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    int src = 0;
    int dist[] = dijkstra(graph, src);
    for(int i=0; i<dist.length; i++) {
        System.out.println(dist[i]+" ");
    }
    bellFord(graph,0);
    System.out.println();
    int V2 = 4;
    ArrayList<Edge> graph2[] = new ArrayList[V2];
    createGraph2(graph2);
    ArrayList<Edge> ans = prims(graph2);
    System.out.println("edgelist for the MST: ");
    for(int i = 0; i < ans.size(); i++){
        Edge ed = ans.get(i);
        System.out.println("src: "+ed.src+" "+"dest: "+ed.dest+" wt: "+ed.wt);
    }
}
}
class Edge {
    int src;
    int dest;
    int wt;
    public Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}
