package Trees.Questions ;
// code correct leetcode 102;
import javax.swing.*;
import java.util.*;

class node {
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class BFS {
    node root;
    public void bfs(){
        Queue<node> q1=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        bfs(root,q1,list);
    }
    public List<List<Integer>> bfs(node root,Queue<node> q1,List<List<Integer>> list){
       if(q1.isEmpty()){
           if(root==null){
               return list;
           }
           if(list.isEmpty()){
                 q1.add(root);
                 return bfs(root,q1,list);
           }
           return list;
       }else{
           int len=q1.size();
           int i=0;
           ArrayList<Integer> arr=new ArrayList<>();
           while(i!=len){
               node t=q1.peek();
               arr.add(t.val);
               if(t.left!=null)
                   q1.add(t.left);
               if(t.right!=null)
                   q1.add(t.right);
               q1.poll();
               i++;
           }
           list.add(arr);
           System.out.println("\n");
           bfs(root,q1,list);
       }
       return list;
    }
    public List<List<Integer>> bfs2(node root){
        List<List<Integer>> result=new ArrayList<>();
        Queue<node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currentlist=new ArrayList<>();
            for(int i=0;i<size;i++){
                node current =q.poll();
                currentlist.add(current.val);
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            result.add(currentlist);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
