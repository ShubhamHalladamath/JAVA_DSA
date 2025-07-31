package A1_leetcode_daily;
class Solution10 {
    public int lengthAfterTransformations(String s, int t) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']+=1;
        }

        for(int k=0;k<t;k++){
            int[] temp=new int[26];
            for(int i=0;i<26;i++){
                if(i!=25 && freq[i]!=0){

                    freq[i]=freq[i]-1;
                    temp[i]+=1;
                }else if(i==25 && freq[i]!=0){
                    freq[i]-=1;
                    freq[0]+=1;
                    freq[1]+=1;
                }
            }
            for(int i=0;i<26;i++){
                freq[i]=temp[i]+freq[i];
            }

        }
        int sum=0;
        for(int i:freq){
            sum+=i;
        }
        return sum;
    }
}
public class rough2 {
    public static void main(String[] args) {
        Solution10 s=new Solution10();
        System.out.println(s.lengthAfterTransformations("k",10));
    }
}
