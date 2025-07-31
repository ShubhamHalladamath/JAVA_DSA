package Trees.StriverSDE_medium;
import java.util.*;
class pair{
    int clm;
    Node node;
    pair(Node node,int clm){
        this.clm=clm;
        this.node=node;
    }

}

class Solution7 {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        int min=0;
        int max=0;
        while(!q.isEmpty()){
            int size=q.size();
            for (int i = 0; i < size; i++) {
                pair temp=q.poll();
                Node current=temp.node;
                int col=temp.clm;
                if(current.left!=null){
                    q.add(new pair(current.left,col-1));
                }
                if(current.right!=null){
                    q.add(new pair(current.right,col+1));
                }
                min=Math.min(min,col);
                max=Math.max(max,col);
                if(!map.containsKey(col)){
                    map.put(col, current.data);
                }
            }
        }
        for (int i = min; i <=max ; i++) {
            result.add(map.get(i));
        }
        return result;
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        int min=0;
        int max=0;
        while(!q.isEmpty()){
            int size=q.size();
            for (int i = 0; i < size; i++) {
                pair temp=q.poll();
                Node current=temp.node;
                int col=temp.clm;
                if(current.left!=null){
                    q.add(new pair(current.left,col-1));
                }
                if(current.right!=null){
                    q.add(new pair(current.right,col+1));
                }
                min=Math.min(min,col);
                max=Math.max(max,col);

                map.put(col, current.data);

            }
        }
        for (int i = min; i <=max ; i++) {
            result.add(map.get(i));
        }
        return result;
    }
}
public class q7_top_view {
    public static void main(String[] args) {
//      tow view of the binary tree........
//      bottom view of the binary tree.....
    }
}
