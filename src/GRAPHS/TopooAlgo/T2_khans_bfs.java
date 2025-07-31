package GRAPHS.TopooAlgo;
import java.util.*;
class Solution3 {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
        int[] inorder=new int[adj.size()];
        for(int i=0;i<adj.size();i++){
            for(int j:adj.get(i)){
                inorder[j]+=1;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        List<Integer> topo=new ArrayList<>();
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int p=q.poll();
            topo.add(p);
            for(int i:adj.get(p)){
                inorder[i]--;
                if(inorder[i]==0){
                    q.add(i);
                }
            }


        }
        if(topo.size()!=adj.size()){
            return true;
        }else{
            return false;
        }
    }
}
public class T2_khans_bfs {
    public static void main(String[] args) {
//          using bfs for cylic directed detection
    }
}

