package GRAPHS;
import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution1 {
    // Function to return Breadth First Traversal of given graph.
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            ans.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            ans.get(edges[i][0]).add(edges[i][1]);
            ans.get(edges[i][1]).add(edges[i][0]);
        }
        return ans;

    }
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
             ArrayList<Integer> result=new ArrayList<>();
             boolean[] check=new boolean[adj.size()];
             Queue<Integer> q=new LinkedList<>();
             q.add(v);
             while(!q.isEmpty()){
                 int removed=q.poll();
                 if(!check[removed]){
                     result.add(removed);
                     check[removed]=true;
                     for(int i:adj.get(removed)){
                         if(!check[i]){
                             q.add(i);
                         }
                     }
                 }

             }
             return result;
    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
            ArrayList<Integer> result=new ArrayList<>();
            boolean[] visited=new boolean[adj.size()];
            dfs(0,result,adj,visited);

            return result;
    }
    private void dfs(int v,ArrayList<Integer> result,ArrayList<ArrayList<Integer>> adj,boolean[] visted){
        visted[v]=true;
        result.add(v);
        for(int i:adj.get(v)){
            if(!visted[i]){
                dfs(i,result,adj,visted);
            }
        }
    }
}
public class G1_BFS_DFS{
    public static void main(String[] args) {
           Solution1 s1=new Solution1();
           ArrayList<ArrayList<Integer>> list=new ArrayList<>();
           list.add(new ArrayList<>(Arrays.asList(1,2)));
           list.add(new ArrayList<>(Arrays.asList(0,2)));
           list.add(new ArrayList<>(Arrays.asList(0,1,3,4)));
        list.add(new ArrayList<>(Arrays.asList(2)));
        list.add(new ArrayList<>(Arrays.asList(2)));
        System.out.println(list);
        System.out.println(s1.bfsOfGraph(0,list));
        System.out.println(s1.dfsOfGraph(list));

    }
}
