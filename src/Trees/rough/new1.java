package Trees.rough;

public class new1 {
    public static void main(String[] args) {

            int[] coins={5,2,1};
            int amount=11;
            int ans=0;
            for(int i:coins){
                if(amount==0) break;
                int a=(amount/i);
                ans=ans+a;
                amount=amount-i*a;
            }
        System.out.println(ans);

    }
}
