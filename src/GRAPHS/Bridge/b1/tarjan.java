package GRAPHS.Bridge.b1;

import java.util.*;
import java.util.List;

public class tarjan {
    static int timer=0;
    static List<List<Integer>> ans=new ArrayList<>();
    public static void main(String[] args) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=10;
        int[] DT=new int[n];
        int[] low=new int[n];
        boolean[] visited=new boolean[n];
        dfs(0,visited,adj,DT,low,-1);
        System.out.println(ans);
    }
    public static void dfs(int current,boolean[] visited,List<List<Integer>> adj,int[] DT,int[] low,int par){
        DT[current]=low[current]=timer;
        visited[current]=true;
        timer++;
        for(int neighbour:adj.get(current)){
            if(neighbour==par) continue;
            if(!visited[neighbour]){
                dfs(neighbour,visited,adj,DT,low,current);
                low[current]=Math.min(low[neighbour],low[current]);
                if(low[neighbour]>DT[current]){
                    ans.add(new ArrayList<>(Arrays.asList(neighbour,current)));
                }
            }else {
                low[current]=Math.min(low[neighbour],low[current]);
            }
        }
    }
}
