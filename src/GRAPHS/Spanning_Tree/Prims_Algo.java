package GRAPHS.Spanning_Tree;
import java.util.*;
class Tuple {
    int cost;
    int node;
    int parent;
    Tuple(int x, int y,int z){
        this.cost =x;
        this.node =y;
        this.parent=z;
    }
}
class Solution20{
    public static List<int[]> MST;
    static int spanningTree(int v, int E, List<List<int[]>> adj) {
        // Code Here.
        List<List<Tuple>> graph=new ArrayList<>();

        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<adj.size();i++){
            for(int[] edge:adj.get(i)){
                int neighbor = edge[0];
                int weight = edge[1];
                graph.get(i).add(new Tuple(weight,neighbor,i));
                graph.get(neighbor).add(new Tuple(weight,i,neighbor));
            }
        }
        PriorityQueue<Tuple> q=new PriorityQueue<>((a, b)->Integer.compare(a.cost,b.cost));
        q.add(new Tuple(0,0,-1));
        boolean[] visited=new boolean[v];
        int min=0;
        MST=new ArrayList<>();

        while(!q.isEmpty()){
            Tuple removed=q.poll();
            int w=removed.cost;
            int val=removed.node;
            if(visited[val]) {
                continue;
            }
            visited[val] = true;
            min = min + w;
            MST.add(new int[]{val,removed.parent});

            for(Tuple p:graph.get(val)){
                int newW=p.cost;
                int newVal=p.node;
                if(!visited[newVal]){
                    q.add(new Tuple(newW,newVal,val));
                }
            }
        }
        return min;
    }
}
public class Prims_Algo {
    public static void main(String[] args) {
        List<List<int[]>> adj = new ArrayList<>();
        int V = 4, E = 3;

        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(new int[]{1, 10});
        adj.get(0).add(new int[]{2, 15});
        adj.get(0).add(new int[]{3, 30});
        adj.get(1).add(new int[]{0, 10});
        adj.get(1).add(new int[]{3, 40});
        adj.get(2).add(new int[]{0, 15});
        adj.get(2).add(new int[]{3, 50});
        adj.get(3).add(new int[]{0, 30});
        adj.get(3).add(new int[]{1, 40});
        adj.get(3).add(new int[]{2, 50});
        System.out.println(Solution20.spanningTree(4,3,adj));
        for(int[] i:Solution20.MST){
            System.out.println(Arrays.toString(i));
        }
    }
}
