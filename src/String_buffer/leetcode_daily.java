package String_buffer;
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0;
        int j=k-1;
        int temp=0;
        for(int l=0;l<=j;l++){
            if(blocks.charAt(l)=='W') temp++;
        }
        int ans=temp;
        while(j+1<blocks.length()){
            if(blocks.charAt(i)=='W'){
                temp--;
            }
            if(blocks.charAt(j+1)=='W'){
                temp++;
            }
            i++;
            j++;
            System.out.println(i+","+j+","+temp);


            ans=Math.max(temp,ans);
        }
        return ans;
    }
}
public class leetcode_daily {
    public static void main(String[] args) {
        System.out.println(new Solution().minimumRecolors("WBBWWBBWBW",7));
    }
}
