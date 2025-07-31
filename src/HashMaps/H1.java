package HashMaps;
// for peoblems refer college wallaha haSHMAPS problems vedio
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class H1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] arr={1,2,3,3,3,4,5,1};
        HashSet<Integer> a=new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=-1;
        int maxkey=-1;
        System.out.println(map);

        for(var e:map.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                maxkey=e.getValue();
            }
        }
        System.out.println(maxkey);
}
}
