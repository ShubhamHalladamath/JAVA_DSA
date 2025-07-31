package recurssion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        helper(nums,new ArrayList<>(),0);
        return ans;
    }
    private void helper(int[] nums,List<Integer> temp,int index){
        if(index>=nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[index]);
        helper(nums,temp,index+1);
        temp.remove(temp.size()-1);
        helper(nums,temp,index+1);
    }
}
public class re_subset {

    public static void main(String[] args) {
        List<List<Integer>> ans=set(new int[]{1,2,3});
        System.out.println(ans);

    }

    static List<List<Integer>> set(int[] arr) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            int n=outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }

        }
        return outer;
    }

}
