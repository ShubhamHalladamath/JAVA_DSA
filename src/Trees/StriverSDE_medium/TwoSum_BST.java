package Trees.StriverSDE_medium;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
class iterator{
    Stack<TreeNode> stack;
    boolean check;
    iterator(TreeNode root,boolean check){
        this.stack=new Stack<>();
        this.check=check;
        pushall(root);
    }
    public int current(){
        return stack.peek().val;
    }
    public int next(){
        TreeNode removed=stack.pop();
        if(check){
            pushall(removed.right);
        }else{
            pushall(removed.left);
        }
        return removed.val;
    }
    public void pushall(TreeNode root){
        while(root!=null){
            stack.push(root);
            if(check){
                root=root.left;
            }else{
                root=root.right;
            }
        }
    }
}
class Solution12 {

    public boolean findTarget(TreeNode root, int k) {
        iterator left=new iterator(root,true);
        iterator right=new iterator(root,false);
        int l=left.current();
        int r=right.current();
        while(l<r){
            if(l+r==k){
                return true;
            }
            if(l+r>k){
                right.next();
            }else{
                left.next();
            }
            l=left.current();
            r=right.current();
        }
        return false;
    }
    Set<Integer> set;
    public boolean findTarget2(TreeNode root, int k) {
        set = new HashSet<>();
        return find(root, k);
    }

    private boolean find(TreeNode root, int k){
        if(root == null)
            return false;

        if(set.contains(root.val))
            return true;

        set.add(k-(root.val));

        return find(root.left, k) || find(root.right, k);
    }

}
public class TwoSum_BST {
    public static void main(String[] args) {
//        https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
    }
}
