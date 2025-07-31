package Trees.Questions;
//for reference leetcode 993:::
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode XX=findnode(root,x);
        TreeNode YY=findnode(root,y);
        return (
                level(root,XX,0)==level(root,YY,0) && !siblings(root,XX,YY)
        );

    }
    TreeNode findnode(TreeNode root,int x){
        if(root==null){
            return null;
        }
        if(root.val==x){
            return root;
        }
        TreeNode t=findnode(root.left,x);
        if(t!=null){
            return t;
        }
        return findnode(root.right,x);
    }
    int level(TreeNode root,TreeNode x,int l){
        if(root==null){
            return -1;
        }
        if(root==x){
            return l;
        }
        int temp=level(root.left,x,l+1);
        if(temp!=-1){
            return temp;
        }
        return level(root.right,x,l+1);
    }
    boolean siblings(TreeNode root,TreeNode x,TreeNode y){
        if(root==null){
            return false;
        }
        if((root.left==x && root.right==y) || (root.left==y && root.right==x)){
            return true;
        }
        boolean temp=siblings(root.left,x,y);
        if(temp==true){
            return true;
        }
        return siblings(root.right,x,y);
    }
}
public class cousins {
    public static void main(String[] args) {
        Solution s1=new Solution();

    }
}
