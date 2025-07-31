package LinkedLists.questions;
class Node{
    int val;
    Node next;
    Node random;
    Node(int i){
        this.val=val;
        this.next=null;
        this.random=null;
    }
}
public class clone_linknkedlist {
    public static void main(String[] args) {
        Node head=new Node(1);

    }
    public static Node clone(Node head){
        Node temp=head;
        while(temp!=null){
            Node dummy=temp.next;
            temp.next=new Node(temp.val);
            temp.next.next=dummy;
            temp=dummy;
        }
        temp=head;
        while(temp.next!=null){
            temp.next.random=(temp.random!=null?temp.random.next:null);
            temp=temp.next.next;
        }
        Node f=head;
        Node s=head.next;
        while(f!=null && s!=null){
            f.next=s.next;
            f=s.next;
            s.next=f.next;
            s=f.next;
        }
        return s;
    }
}
