package Trees.SegmentTrees;
class STA{
    int[] SegmentTree;
    int[] nums;
    STA(int[] nums){
        this.SegmentTree=new int[4*nums.length];
        this.nums=nums;
    }
    public void constructTree(int index,int l,int r){
        if(l==r){
            SegmentTree[index]=nums[l];
            return ;
        }
        int left=(2*index+1);
        int right=(2*index+2);
        int mid=(l+r)/2;
        constructTree(left,l,mid);
        constructTree(right,mid+1,r);
        SegmentTree[index]=SegmentTree[left]+SegmentTree[right];
    }
    public int Query(int i,int kl,int kr,int l,int r){
         if((l>kr && r>kr)|| l<kl && r<kl){
             return 0;
         }
         if(l>=kl && r<=kr){
             return SegmentTree[i];
         }
        int left=(2*i+1);
        int right=(2*i+2);
        int mid=(l+r)/2;
        return Query(left,kl,kr,l,mid)+Query(right,kl,kr,mid+1,r);
    }
    public void update(int keyi,int key,int i,int l,int r){
        if(l==r){
            SegmentTree[i]=key;
            return ;
        }
        int left=(2*i+1);
        int right=(2*i+2);
        int mid=(l+r)/2;
        if (keyi <= mid) {
            update(keyi,key,left,l,mid);
        }else{
            update(keyi,key,right,mid+1,r);
        }
        SegmentTree[i]=SegmentTree[left]+SegmentTree[right];
    }
}
public class Array_BASE_representation {

    public static void main(String[] args) {
           STA s=new STA(new int[]{1,2,3,4,5});
           s.constructTree(0,0,3);
           System.out.println(s.Query(0,3,2,0,3));
    }


}
