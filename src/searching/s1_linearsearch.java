package searching;

public class s1_linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int key =6;
        boolean ans =search(arr,key);
        System.out.println(ans);
    }
    static boolean search(int[] arr,int key){
        boolean ans=false;
        for (int i = 0; i <arr.length ; i++) {
            if(key==arr[i]){
                return true;
            }

        }
        return ans;
    }
}
