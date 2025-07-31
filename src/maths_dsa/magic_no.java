package maths_dsa;

public class magic_no {
    public static void main(String[] args) {
        System.out.println(digits(128));
    }
    static int value(int n){
        int ans=0;
        int i=1;
        while(n>0){
            if((n&1)==0){
                n=(n>>1);
            }
            else{
               ans=ans+(int)(Math.pow(5,i));
               n=n>>1;
            }
            i++;
        }

        return ans;
    }
    static int digits(int n){
        int ans=0;
        while(n>0){
            n=n>>1;
            ans++;
        }

        return ans;
    }

}
