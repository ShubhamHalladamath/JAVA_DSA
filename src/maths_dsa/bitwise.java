package maths_dsa;
//a<<b,means a*(2^b)       ||||     a>>b,means a/(2^b)

public class bitwise {
    public static void main(String[] args) {
  int[] arr={1,0,1};


    }
    static boolean odd_even(int n){
        //     boolean ans=odd_even(75);
//     if(ans){
//         System.out.println("odd");
//     }
//     else{
//         System.out.println("even");
//     }
        return ((n&1)==1);
    }
    static int appear_once(int[] arr){
        //a^0=a,a^1=(a_complement){this operation is associative}
        //        int[] arr={1,2,3,4,3,2,1};
//        System.out.println(appear_once(arr));
        int a=arr[0];

        for (int i = 1; i < arr.length; i++) {
            a=a^arr[i];
        }
        return a;
    }
    static boolean find_bit(int n,int num){
        return ((num & (1<<4)) == num);
    }

}
