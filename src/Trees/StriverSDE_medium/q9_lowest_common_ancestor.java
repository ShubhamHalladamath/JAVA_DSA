package Trees.StriverSDE_medium;
class Solution9 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root,p,q);
    }
    public TreeNode helper(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return root;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode left=helper(root.left,p,q);
        TreeNode right=helper(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        if(left!=null){
            return left;
        }
        return right;
    }
}
public class q9_lowest_common_ancestor{
    public static void main(String[] args) {
//        ansistor related problem
    }
}
