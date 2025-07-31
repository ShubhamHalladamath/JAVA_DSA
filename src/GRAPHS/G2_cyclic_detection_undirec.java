package GRAPHS;
import java.util.*;
class pair{
    int x,y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class G2_cyclic_detection_undirec {
    public static void main(String[] args) {
//          using bfs;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        System.out.println(adj);
        System.out.println(isCycle(adj));
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] check=new boolean[adj.size()];
        for(int i=0;i<check.length;i++){
            if(!check[i]){
                if(bfs(i,check,adj)){
                    return true;
                }
            }
        }
        return false;

    }
    public boolean dfs(int start,boolean[] check,ArrayList<ArrayList<Integer>> adj,int prev){
        check[start]=true;
        boolean ans=false;
        for(int i:adj.get(start)){
            if(!check[i]){
                ans=dfs(i,check,adj,start);
                if(ans){
                    return true;
                }
            }else if(i!=prev){
                return true;
            }
        }
        return ans;
    }
    public static boolean bfs(int start,boolean[] check,ArrayList<ArrayList<Integer>> adj){
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(start,-1));
        while(!q.isEmpty()){
            pair removed=q.poll();
            check[removed.x]=true;
            for(int i:adj.get(removed.x)){

                if(!check[i]){
                    q.add(new pair(i,removed.x));
                }else if(i!=removed.y){
                    return true;
                }
            }
        }
        return false;
    }
}
