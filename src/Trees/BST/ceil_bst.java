package Trees.BST;

import Trees.StriverSDE_medium.TreeNode;

public class ceil_bst {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(-1);
        int key=10;
        int ceil=-1;
        while(root!=null){
            if(root.val==key){
                ceil=root.val;
                return ;
            }
            if(root.val<key){
                root=root.right;
            }
            if(root.val>key){
                root=root.left;
            }
        }
        System.out.println(ceil);
    }
}
