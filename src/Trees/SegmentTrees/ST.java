package Trees.SegmentTrees;
class node{
    int data;
    int startindex;
    int endindex;
    node left;
    node right;
    public node(int startindex,int endindex){
        this.startindex=startindex;
        this.endindex=endindex;
    }
}
public class ST {
    private node root;
    public ST(int[] arr){
        this.root=ConstructTree(arr,0,arr.length-1);
    }

    private node ConstructTree(int[] arr, int a, int b) {
        if(a==b){
            node leaf=new node(a,b);
            leaf.data=arr[a];
            return leaf;
        }
        node p=new node(a,b);
        p.left=ConstructTree(arr,a,(a+b)/2);
        p.right=ConstructTree(arr, ((a+b)/2)+1, b);
        p.data=p.left.data+p.right.data;
        return p;
    }
    public int sum(int a,int b){
        if(a>=root.startindex && b>root.endindex || a<root.startindex && b<=root.endindex){
            return 0;
        }
        return sum(root,a,b);
    }
    private int sum(node root,int a,int b){

        if((a>root.endindex && b>root.endindex) || (a<root.startindex && b<root.startindex)){
            return 0;
        }
        if(root.startindex>=a && root.endindex<=b){
            return root.data;
        }
        int p=sum(root.left,a,b);
        int q=sum(root.right,a,b);
        return p+q;
    }
    public void update(int index,int val){
        root=update(root,index,val);
    }
    private node update(node root,int i,int val){
        if(i==root.startindex && i==root.endindex){
            root.data=val;
            return root;
        }
        if(i>=root.left.startindex && i<=root.left.endindex){
            root.left=update(root.left,i,val);
        }else{
            root.right=update(root.right,i,val);
        }
        root.data=root.left.data+root.right.data;
        return root;
    }
}
