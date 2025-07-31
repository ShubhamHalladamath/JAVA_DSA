package Trees.StriverSDE_medium;
class Solution10 {
    public TreeNode bstFromPreorder(int[] arr) {
        return helper(arr,Integer.MAX_VALUE);
    }
    int i=0;
    public TreeNode helper(int[] arr,int upper){
        if(i>=arr.length || arr[i]>upper){
            return null;
        }
        TreeNode  root=new TreeNode(arr[i++]);
        root.left=helper(arr,root.val);
        root.right=helper(arr,upper);
        return root;
    }
}
public class q10_BST_preorder {
    public static void main(String[] args) {
//        using upperbound lower bound concept//........
//        https://youtu.be/UmJT3j26t1I

    }
}
