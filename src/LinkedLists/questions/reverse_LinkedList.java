package LinkedLists.questions;

public class reverse_LinkedList {
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        CustomLinkedList2 list1=new CustomLinkedList2();
        list1.inserAtEnd(2);
        list1.inserAtEnd(9);
        list1.inserAtEnd(9);
        list1.display();

    }
    static int carry=0;
    public Node addOne(Node head) {
        // code here.
        Node temp=head;
        if(head.next==null){
            head.data=head.data+1+carry;
            return head;
        }
        head=addOne(head.next);
        if(head.data>9){
            carry=1;
            head.data=0;
        }else{
            head.data=head.data+carry;
        }

        return temp;
    }
}
//    linkedlist problem no 206 leetcode;
//     public ListNode reverseList(ListNode head) {
//        ListNode temp=head;
//         ListNode prev=null;
//         ListNode present=head;
//         if(present==null){
//            return head;
//         }
//         ListNode prenext=head.next;
//         while(prenext!=null){
//            present.next=prev;
//            prev=present;
//            present=prenext;
//           prenext=prenext.next;
//            if(prenext==null){
//                present.next=prev;
//            return present;
//         }
//         }
//
//       return head;
//    }

//leetcode 92 reversing the sublist in the given list;;;;
//public ListNode reverseBetween(ListNode head, int left, int right) {
//    ListNode prev=null;
//    ListNode current=head;
//    ListNode Next=head.next;
//    int i=0;
//    while(i!=left-1 && current!=null){
//        prev=current;
//        current=Next;
//        Next=Next.next;
//        i++;
//    }
//    ListNode last=prev;
//    ListNode newend=current;
//    i=0;
//    while(i!=(right-left+1) && current!=null){
//        current.next=prev;
//        prev=current;
//        current=Next;
//        if(Next!=null){
//            Next=Next.next;
//        }
//        i++;
//    }
//    if(last!=null){
//        last.next=prev;
//    }else{
//        head=prev;
//    }
//    newend.next=current;
//
//    return head;
//}
