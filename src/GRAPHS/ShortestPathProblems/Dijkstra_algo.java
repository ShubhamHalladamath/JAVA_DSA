package GRAPHS.ShortestPathProblems;
import java.util.*;

class D1{
    int[] dijkstra(ArrayList<ArrayList<pair>> adj, int src){
        PriorityQueue<pair> q=new PriorityQueue<>((a,b)->Integer.compare(a.dis,b.dis));
        int[] ans=new int[adj.size()];
        q.add(new pair(src,0));
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src]=0;
        while(!q.isEmpty()){
            pair removed=q.poll();
            int par=removed.val;
            int dis=removed.dis;
            for(pair i:adj.get(par)){
                int child=i.val;
                int childdis=i.dis;
                int newdis=childdis+dis;
                if(ans[child]>newdis){
                    ans[child]=newdis;
                    q.add(new pair(child,newdis));
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==Integer.MAX_VALUE){
                ans[i]=-1;
            }
        }
        return ans;
    }
}
public class Dijkstra_algo {
    public static void main(String[] args) {
        int n = 5; // Number of nodes
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        D1 d=new D1();
        // Example graph (undirected with weights)
        adj.get(0).add(new pair(1, 2));
        adj.get(0).add(new pair(2, 4));
        adj.get(1).add(new pair(2, 1));
        adj.get(1).add(new pair(3, 7));
        adj.get(2).add(new pair(4, 3));
        adj.get(3).add(new pair(4, 2));

        int src = 0; // Starting node
        int[] shortestDistances = d.dijkstra(adj, src);
        System.out.println(Arrays.toString(shortestDistances));
    }
}
