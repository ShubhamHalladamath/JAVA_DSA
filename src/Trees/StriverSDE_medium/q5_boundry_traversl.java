package Trees.StriverSDE_medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution5{
    public ArrayList<Integer> addleft(TreeNode root,ArrayList<Integer> ans){
        ans.add(root.val);
        TreeNode current=root.left;
        while(current!=null){
            if(isleaf(current)){
                break;

            }
            ans.add(current.val);
            if(current.left!=null){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return ans;
    }
    public ArrayList<Integer> addright(TreeNode root,ArrayList<Integer> res){
        ArrayList<Integer> ans=new ArrayList<>();
        TreeNode current=root.right;
        while(current!=null){
            if(isleaf(current)){
                break;
            }
            ans.add(current.val);
            if(current.right!=null){
                current=current.right;
            }else{
                current=current.left;
            }
        }
        for (int i = ans.size()-1; i >=0 ; i--) {
            res.add(ans.get(i));
        }
        return res;
    }
    public ArrayList<Integer> addleaves(TreeNode root,ArrayList<Integer> ans){
        if(isleaf(root)){
            ans.add(root.val);
            return ans;
        }
        if(root.left!=null)
              addleaves(root.left,ans);
        if(root.right!=null){
               addleaves(root.right,ans);
        }
        return ans;
    }
    public ArrayList<Integer> printboundries(TreeNode root){
        ArrayList<Integer> ans=new ArrayList<>();
        addleft(root,ans);
        addleaves(root,ans);
        addright(root,ans);
        return ans;
    }
    public boolean isleaf(TreeNode root){
        return root.left==null && root.right==null ;
    }
}
public class q5_boundry_traversl {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.left.left=new TreeNode(99);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        Solution5 s1=new Solution5();
        List<Integer> ans=new ArrayList<>(s1.printboundries(root));
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
