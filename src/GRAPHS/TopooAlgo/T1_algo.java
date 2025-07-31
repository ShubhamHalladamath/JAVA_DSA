package GRAPHS.TopooAlgo;
import java.util.*;
class Solution {
    // Function to return list containing vertices in Topological order.
     Stack<Integer>  stack;
     public ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        // Your code here
        boolean[] visited=new boolean[adj.size()];
        stack=new Stack<>();
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfs(visited,adj,i);
                stack.push(i);
            }
        }

        ArrayList<Integer> ans=new ArrayList<>();
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans;
    }
    private  void dfs(boolean[] visited,ArrayList<ArrayList<Integer>> adj,int v){
        visited[v]=true;
        for(int i:adj.get(v)){
            if(!visited[i]){
                dfs(visited,adj,i);
                stack.push(i);
            }
        }
    }
}
public class T1_algo {
    public static void main(String[] args) {

    }
}
