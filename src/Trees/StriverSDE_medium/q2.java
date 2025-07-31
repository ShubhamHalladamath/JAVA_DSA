package Trees.StriverSDE_medium;
class Solution2 {
    public int maxDepth(TreeNode root) {
        return height(root);
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
public class q2 {
    public static void main(String[] args) {
//         maximum height of the tree

    }
}
