package Heaps;
import java.util.*;
class Solution4{
    public int leastInterval(char[] tasks, int n) {
        Arrays.sort(tasks);
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }
        for(char ch : map.keySet()){

        }
        return 0;
    }
}
public class TaskManager {
    public static void main(String[] args) {

    }
}
