package GraphDataStructure.GraphPart1.GraphsPart5;
import java.util.*;
public class CheapestFlightsWithinKStops {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[], int[][] flight){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<graph.length;i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

            Edge e= new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class info{
        int v;
        int cost;
        int stops;
        public info(int v, int c, int k){
            this.v=v;
            this.cost = c;
            this.stops=k;
        }
    }

    public static int changeFlight(int n, int flights[][], int src, int dest, int k){
        ArrayList<Edge>[] graph = new ArrayList[n];
        creatGraph(graph, flights);

        int dist[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!= src){
                dist[i]= Integer.MAX_VALUE;
            }
        }

        Queue<info> q = new LinkedList<>();
        q.add(new info(src, 0, 0));

        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr.stops>k){
                break;
            }
            for(int i=0;i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if(curr.cost+wt < dist[v] && curr.stops <= k){
                    dist [v] = curr.cost+wt;
                    q.add(new  info(v, dist[v],curr.stops+1));
                }
            }
        }
        // dist[dist]
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }

    public static void main(String[] args) {
        int v=4;
        int flight[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0, dst = 3, k=1;  
        int shortdist=changeFlight(v, flight, src, dst, k);
        System.out.println(shortdist);
    }
}
