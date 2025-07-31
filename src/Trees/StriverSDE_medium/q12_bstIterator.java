package Trees.StriverSDE_medium;
import java.util.*;
class BSTIterator {
    Stack<TreeNode> stack=new Stack<>();
    public BSTIterator(TreeNode root) {
        TreeNode temp=root;
        while(temp!=null){
            stack.push(temp);
            temp=temp.left;
        }
    }

    public int next() {
        TreeNode removed=stack.pop();
        if(removed.right!=null){
            TreeNode temp=removed.right;
            while(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
        }
        return removed.val;
    }

    public boolean hasNext() {
        if(stack.isEmpty()){
            return false;
        }
        return true;
    }
}


public class q12_bstIterator {
    public static void main(String[] args) {

//         Your BSTIterator object will be instantiated and called as such:
//        https://leetcode.com/problems/binary-search-tree-iterator/
         TreeNode root=null;
         BSTIterator obj = new BSTIterator(root);
          int param_1 = obj.next();
          boolean param_2 = obj.hasNext();

    }
}
