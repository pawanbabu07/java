package GraphDataStructure.GraphPart1.GraphsPart2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BipartiteGraph {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src= s;
            this.dest= d;
        }
    }

    public static void CreateGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[]= new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;//no color
        }

        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i]== -1){//BFS
                q.add(i);
                col[i]=0; //yellow
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j =0; j<graph[curr].size(); j++){
                        Edge e= graph[curr].get(j); //e.dest
                        if(col[e.dest]==-1){
                            int nextCol = col[curr] == 0 ? 1:0;
                            col[e.dest]= nextCol;
                            q.add(e.dest);
                        }else if(col[e.dest]==col[curr]){
                            return false; //not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // disconneted graph is bipartire graph 
         /*
         *          0-------3
         *         /       /
         *        /       /   
         *       /       /    
         *      1       4
         *       \     / 
         *        \   /
         *         \ /
         *          3
         */
        int v=5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreateGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
