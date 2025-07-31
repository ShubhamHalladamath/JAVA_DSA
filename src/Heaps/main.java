package Heaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        CustomHeap<Integer> h1=new CustomHeap<>();
        Set<Integer> s1=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        s1.add(5);
        s1.add(3);
        System.out.println(s1);
        h1.insert(43);
        h1.insert(36);
        h1.insert(78);
        h1.insert(100);
        h1.insert(23);
        h1.insert(3);
        h1.insert(6);
        System.out.println(h1.heapsort());
        System.out.println(h1.list);

    }
}
