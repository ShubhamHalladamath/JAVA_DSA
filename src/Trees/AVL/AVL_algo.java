package Trees.AVL;
class node{
    int val;
    int height;
    node left;
    node right;
    node(int val){
        this.val=val;
    }

}
public class AVL_algo {
    node root;
    private int getHeight(node root){
        if(root==null){
            return -1;
        }
        return root.height;
    }
   public void insert(int val){
       root=insert(root,val);
       return ;
    }
    private node insert(node root,int val){
        if(root==null){
            node ptr=new node(val);
            ptr.height=Math.max(getHeight(ptr.left),getHeight(ptr.right))+1;
            return ptr;
        }
        if(val<root.val){
            root.left=insert(root.left,val);
        }
        if(val>root.val){
            root.right=insert(root.right,val);
        }
        root.height=Math.max(getHeight(root.left),getHeight(root.right))+1;
        return rotation(root);
    }
    public void display(){
        display(root,"","");
    }
    void display(node root, String temp, String dum){
        if(root==null){
            return;
        }
        System.out.println(temp+dum+root.val);
        display(root.left,temp+"\t","Left node of "+root.val+" :->");
        display(root.right,temp+"\t","Right node of "+root.val+" :->");
    }
   private node rotation(node root){
        if(getHeight(root.left)-getHeight(root.right)>1){
//            left case
            if(getHeight(root.left.left)-getHeight(root.left.right)>0){
//              left -> left case
                return rightrotate(root);
            }
            if(getHeight(root.left.left)-getHeight(root.left.right)<0){
//              left -> rightn case
                root.left=leftrotate(root.left);
                return rightrotate(root);
            }
        }
       if(getHeight(root.left)-getHeight(root.right)< -1){
//            right case
           if(getHeight(root.right.left)-getHeight(root.right.right)>0){
//              right -> left case
               root.right=rightrotate(root.right);
               return leftrotate(root);
           }
           if(getHeight(root.right.left)-getHeight(root.right.right)<0){
//              right -> right case
              return leftrotate(root);
           }
       }
       return root;
   }
   private node rightrotate(node p){
       node c=p.left;
       node t=c.right;
       c.right=p;
       p.left=t;
       p.height=Math.max(getHeight(p.left),getHeight(p.right))+1;
       c.height=Math.max(getHeight(c.left),getHeight(c.right))+1;
       return c;
   }
   private node leftrotate(node p){
       node c=p.right;
       node t=c.left;
       c.left=p;
       p.right=t;
       p.height=Math.max(getHeight(p.left),getHeight(p.right))+1;
       c.height=Math.max(getHeight(c.left),getHeight(c.right))+1;
       return c;
    }
    public boolean balanced(){
       return  balanced(root);
    }
    private boolean balanced(node root){
        if(root==null){
            return true;
        }
        return (Math.abs(getHeight(root.left)-getHeight(root.right))<=1) && balanced(root.left) && balanced(root.right);
    }
}
