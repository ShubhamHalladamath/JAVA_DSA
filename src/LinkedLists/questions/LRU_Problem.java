package LinkedLists.questions;
import java.util.*;
class LRUCache {
    Map<Integer,Integer> map;
    LinkedList<Integer> list;

    int size=10;
    public LRUCache(int capacity) {
        this.map=new HashMap<>();
        this.list=new LinkedList<>();
        this.size=capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        list.remove((Integer) key);
        list.add(key);
        return map.get(key);
    }


    public void put(int key, int value) {
        if (map.containsKey(key)) {
            // Update the value and move the key to the end (MRU)
            list.remove((Integer) key);
            list.add(key);
            map.put(key, value);
            map.getOrDefault(key,0);
        } else {
            if (list.size() == size) {
                // Evict the LRU key
                Integer lruKey = list.removeFirst(); // Remove from the beginning
                map.remove(lruKey); // Remove the evicted key from the map
            }
            // Add the new key-value pair
            list.add(key);
            map.put(key, value);
        }
    }
}
public class LRU_Problem {
    public static void main(String[] args) {

    }
}
