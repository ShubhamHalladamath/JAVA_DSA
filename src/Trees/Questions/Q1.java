package Trees.Questions;
// leetcode application problem of bfs question no.637
//class Solution {
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> result=new ArrayList<>();
//        Queue<TreeNode> q=new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty()){
//            List<Integer> currentlist=new ArrayList<>();
//            int size=q.size();
//            for(int i=0;i<size;i++){
//                TreeNode current=q.poll();
//                currentlist.add(current.val);
//                if(current.left!=null){
//                    q.add(current.left);
//                }
//                if(current.right!=null){
//                    q.add(current.right);
//                }
//            }
//            double sum=0;
//            for(int i=0;i<currentlist.size();i++){
//                sum=sum+currentlist.get(i);
//            }
//            result.add(sum/currentlist.size());
//        }
//        return result;
//    }
//}


import Stacks_Queues.Questions.Queues.q1;

import java.util.LinkedList;
import java.util.Queue;

public class Q1 {
    node root;
    Q1(node root){
        this.root=root;
    }
    public int nextrightelement(int val){
        Queue<node> q=new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for (int i = 0; i < size; i++) {
                node current=q.poll();
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
                if(current.val==val){
                    return q.poll().val;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         Q1 q=new Q1(new node(10));
         q.root.left=new node(17);
         q.root.right=new node(20);
        System.out.println(q.nextrightelement(10));

    }
}
