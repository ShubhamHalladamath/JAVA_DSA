package Trees.StriverSDE_medium;
import java.util.*;
class Solustion6{
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        traversal(root,map,0);
        int[] arr=new int[map.size()];
        int i=0;
        for (Integer key:map.keySet()){
            arr[i]=key;
        }
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for (int j = 0; j < arr.length ; j++) {
            ans.add(new ArrayList<>(map.get(arr[j])));
        }
        return ans;

    }
    public  Map<Integer,ArrayList<Integer>> traversal(TreeNode root, Map<Integer,ArrayList<Integer>> map,int clm){
        if(root==null){
            return map;
        }
        if(!map.containsKey(clm)){
            map.put(clm,new ArrayList<>(root.val));
        }else{
            ArrayList<Integer> list=map.get(clm);
            list.add(root.val);

            map.put(clm,list);
        }
        traversal(root.left,map,clm-1);
        traversal(root.right,map,clm+1);
        return map;
    }
}
public class q6_vertical_traversal {
    public static void main(String[] args) {

    }
}
