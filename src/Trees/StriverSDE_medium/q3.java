package Trees.StriverSDE_medium;
class Solution3{
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root){
        height(root);
        return diameter-1;
    }
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int max=left+right+1;
        diameter=Math.max(diameter,max);
        return Math.max(left,right);
    }
}
public class q3 {
    public static void main(String[] args) {
//       finding the diameter....
    }
}
