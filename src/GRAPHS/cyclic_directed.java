package GRAPHS;
import java.util.*;
class Solution2{
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited=new boolean[adj.size()];
        boolean[] path=new boolean[adj.size()];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                if(dfs(visited,path,adj,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(boolean[] visited,boolean[] path,ArrayList<ArrayList<Integer>> adj,int v){
        visited[v]=true;
        path[v]=true;
        for(int i:adj.get(v)){
            if(!visited[i]){
                boolean ans=dfs(visited,path,adj,i);
                if(ans){
                    return true;
                }
                path[i]=false;
            }else if(visited[i] && path[i]){
                return true;
            }
        }
        path[v]=false;
        return false;
    }
}
public class cyclic_directed {
    public static void main(String[] args) {
//        cyclic ditection;;;;
    }
}
