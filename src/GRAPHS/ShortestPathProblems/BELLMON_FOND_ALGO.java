package GRAPHS.ShortestPathProblems;
import java.util.*;
//helps u to detect negative cycles;
// only applicaple in directed graph;
//only difference is dijstra for only positive weighted,
//helps for checking negative cycle that make dijkshitra ago to give ouput time limit exceeded
class Solution3{
    static int[] bellmanFord(int v, int[][] edges, int src) {
        // Write your code here
        int[] dist=new int[v];
        Arrays.fill(dist,(int)(1e8));

        dist[src]=0;
        for(int i=0;i<v-1;i++){
            for(int j=0;j<edges.length;j++){
                if(dist[edges[j][0]]!=(int)(1e8) && dist[edges[j][0]]+edges[j][2]<dist[edges[j][1]]){
                    dist[edges[j][1]]=dist[edges[j][0]]+edges[j][2];                  }
            }
        }
        for(int j=0;j<edges.length;j++){
            if(dist[edges[j][0]]!=(int)(1e8) && dist[edges[j][0]]+edges[j][2]<dist[edges[j][1]]){
                return new int[]{-1} ;
            }
        }

        return dist;
    }
}
public class BELLMON_FOND_ALGO {
    public static void main(String[] args) {

    }
}
