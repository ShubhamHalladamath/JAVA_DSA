package Trees.PathSum;
class Solution1 {
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
        int temp=left+right+root.val;
        ans=Math.max(temp,ans);
        return Math.max(left+root.val,right+root.val);

    }
}
public class Maximum_pathsum {
    public static void main(String[] args) {
//        A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence
//        has an edge connecting them. A node can only appear in the sequence at most once. Note that the
//        path does not need to pass through the root.
//
//        The path sum of a path is the sum of the node's values in the path.
//
//        Given the root of a binary tree, return the maximum path sum of any non-empty path.
    }
}
