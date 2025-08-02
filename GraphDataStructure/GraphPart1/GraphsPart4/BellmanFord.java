package GraphDataStructure.GraphPart1.GraphsPart4;
import java.util.*;

public class BellmanFord {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d , int w){
            this.src=s;
            this.dest=d;
            this.wt= w;
        }
    }
    static void CreateGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length; i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        int v=graph.length;
        // O(E+V)
        // algo = O(v)
        for(int i=0; i<v-1;i++){
            // edges= O(E)
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size();k++){
                    Edge e =graph[j].get(k);
                    // u,v,wt
                    int u= e.src;
                    int dv= e.dest;
                    int wt= e.wt;
                    //relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt< dist[dv]){
                        dist[dv]= dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0; i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }

// srcond approch
    static void CreateGraph2(ArrayList<Edge> graph){
        
        graph.add(new Edge(0, 1, 2));       
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanFord2(ArrayList<Edge> graph, int src, int v){
        int dist[]=new int[v];
        for(int i=0;i<dist.length; i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        
        // O(E+V)
        // algo = O(v)
        for(int i=0; i<v-1;i++){
            // edges= O(E)
            for(int j=0; j<graph.size(); j++){
                Edge e =graph.get(j);
                    // u,v,wt
                    int u= e.src;
                    int dv= e.dest;
                    int wt= e.wt;
                    //relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt< dist[dv]){
                        dist[dv]= dist[u]+wt;
                    }
            }
        }
        for(int i=0; i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String args[]){
        
        int v=5;
        // first approch
        ArrayList<Edge> graph[]=new ArrayList[v];
        CreateGraph(graph);
        bellmanFord(graph, 0);

        //second approch
        ArrayList<Edge> edges = new ArrayList<>();
        CreateGraph2(edges);
        bellmanFord2(edges, 0, v);
    }
}
