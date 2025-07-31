package maths_dsa;

public class set_bits {
    public static void main(String[] args) {
        System.out.println(set(2));
    }
    static int set(int n){
        int c=0;
        while(n>0){
            if((n & 1)==1){
                c++;
            }
            n=n>>1;
        }
        return c;
    }
}
