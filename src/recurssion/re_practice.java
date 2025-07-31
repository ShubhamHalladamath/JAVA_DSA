package recurssion;

public class re_practice {
    public static void main(String[] args) {
//
        System.out.println(alternatesum(10));;
    }
    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return (n%10)+sum(n/10);
    }
    static int power(int p,int q){
        if(q==0){
            return 1;
        }
        return p*power(p,q-1);
    }
    static void multiples(int num,int k){
        if(k==0){
            return ;
        }
        multiples(num,k-1);
        System.out.println(num*k);
    }
    static int alternatesum(int num){
        if(num==1){
            return 1;
        }
        if(num%2==0){
            num=-num;
            return num+alternatesum((-num)-1);
        }else{
        return num+alternatesum(num-1);
        }
    }
}
