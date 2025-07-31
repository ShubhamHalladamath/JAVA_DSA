package Trees.StriverSDE_medium;
class Solution4 {
    public int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maximum(root);
        return ans;
    }
    public int maximum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maximum(root.left);
        int right=maximum(root.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        int sum=left+right+root.val;
        ans=Math.max(sum,ans);
        return Math.max(left+root.val,right+root.val);
    }
}
public class q4 {
    public static void main(String[] args) {
//        maximum path sum....
    }
}
