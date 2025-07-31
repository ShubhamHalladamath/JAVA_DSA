package Trees.Questions;

import com.sun.source.tree.ArrayTypeTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
import java.util.Arrays;

class leetcode{
    public TreeNode buildtree(int[] pre,int[] in){
        if(pre.length==0){
            return null;
        }
        int r=pre[0];
        int index=-1;
        for(int i=0;i<in.length;i++){
            if(r==in[i]){
                index=i;
                break;
            }
        }
        TreeNode root=new TreeNode(r);
        root.left=buildtree(Arrays.copyOfRange(pre,1,index+1),Arrays.copyOfRange(in,0,index));
        root.right=buildtree(Arrays.copyOfRange(pre,index+1,pre.length),Arrays.copyOfRange(in,index+1,in.length));
       return root;
    }
//    https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
    public TreeNode buildTree(int[] in, int[] post) {
        if(post.length==0){
            return null;
        }
        int r=post[post.length-1];
        int index=-1;
        for(int i=0;i<in.length;i++){
            if(r==in[i]){
                index=i;
                break;
            }
        }
        TreeNode root=new TreeNode(r);
        root.left=buildTree(Arrays.copyOfRange(in,0,index),Arrays.copyOfRange(post,0,index));
        root.right=buildTree(Arrays.copyOfRange(in,index+1,in.length),Arrays.copyOfRange(post,index,post.length-1));
        return root;
    }
}
public class buildtree_pre_in {
    public static void main(String[] args) {
         leetcode q1=new leetcode();
         q1.buildtree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});

    }
}
