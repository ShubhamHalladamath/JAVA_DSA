package Trees.PathSum;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
         this.right = right;
     }
  }
  class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return check(root,targetSum,targetSum);
    }
    public boolean check(TreeNode root,int sum,int target){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            sum=sum-root.val;
            if(sum==0){
                return true;
            }
            return false;
        }
        sum=sum-root.val;
        boolean a=check(root.left,sum,target);
        if(a){
            return a;
        }
        return check(root.right,sum,target);

    }
}
public class targetsum {
    public static void main(String[] args) {

    }
}
