package Trees.StriverSDE_medium;
class Solution1 {
    boolean ans=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        helper(root);
        return ans;
    }

    int  helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left= helper(root.left);
        int right=helper(root.right);
        ans = ans && Math.abs(left-right)<=1;
        return Math.max(left,right)+1;
    }
}
public class q1 {
    public static void main(String[] args) {
//        checking tree balanced or not....
    }
}
