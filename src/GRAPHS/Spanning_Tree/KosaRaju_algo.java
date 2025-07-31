package GRAPHS.Spanning_Tree;
import  java.util.*;
class Solution2 {
    // Function to find number of strongly connected components in the graph.
    Stack<Integer> stack;
    public int kosaraju(ArrayList<ArrayList<Integer>> adj) {
        // code here
        stack=new Stack<>();
        boolean[] visited=new boolean[adj.size()];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfs(i,visited,adj,true);
            }
        }
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<adj.size();i++){
            for(int j:adj.get(i)){
                graph.get(j).add(i);
            }
        }
        Arrays.fill(visited,false);
        int scc=0;
        while(!stack.isEmpty()){
            int val=stack.pop();
            if(!visited[val]){
                dfs(val,visited,graph,false);
                scc++;
            }
        }
        return scc;

    }
    private void dfs(int v,boolean[] visited,ArrayList<ArrayList<Integer>> adj,boolean check){
        visited[v]=true;
        for(int i:adj.get(v)){
            if(!visited[i]){
                dfs(i,visited,adj,check);
            }
        }
        if(check) stack.push(v);

    }

}
public class KosaRaju_algo {
    public static void main(String[] args) {

    }
}
