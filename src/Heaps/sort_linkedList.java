package Heaps;
import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=new ListNode(-1);
        ListNode dummy=head;
        PriorityQueue<ListNode> p=new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));

        for(int i=0;i<lists.length;i++){
            p.add(lists[i]);
        }
        while(!p.isEmpty()){
            ListNode removed=p.poll();
            dummy.next=removed;
            dummy=dummy.next;
            if(removed.next!=null){
                p.add(removed.next);
            }
        }
        return head.next;
    }
}
public class sort_linkedList {
    public static void main(String[] args) {

    }
}
