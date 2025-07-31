package Trees.StriverSDE_medium;

public class q11_succesor_inorder {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode target=new TreeNode(8);
        TreeNode successor=null;
        while(root!=null){
            if(target.val> root.val){
                root=root.right;
            }else{
                successor=root;
                root=root.left;
            }
        }
        System.out.println(successor.val);
    }

}
