package GRAPHS.ShortestPathProblems;
import java.util.*;
class pair{
    int val;
    int dis;
    pair(int x,int y){
        this.val=x;
        this.dis=y;
    }
}
class Solution1 {
    // Function to find the shortest path from a source node to all other nodes
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        // code here
        Queue<pair> q=new LinkedList<>();
        boolean[] visited=new boolean[adj.size()];
        int[] ans=new int[visited.length];
        q.add(new pair(src,0));
        visited[src]=true;
        for(int i=0;i<ans.length;i++){
            ans[i]=-1;
        }
        while(!q.isEmpty()){
            pair temp=q.poll();
            int val=temp.val;
            int dis=temp.dis;
            ans[val]=dis;
            for(int i:adj.get(val)){
                if(!visited[i]){
                    q.add(new pair(i,dis+1));
                    visited[i]=true;
                }
            }
        }

        return ans;
    }
}
public class S1 {
    public static void main(String[] args) {
//      https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph-having-unit-distance/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=shortest-path-in-undirected-graph-having-unit-distance
    }
}
