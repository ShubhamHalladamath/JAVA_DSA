package LinkedLists;

public class customCircularLinkedList {
    private class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
        node(int val, node next){
            this.val=val;
            this.next=next;
        }
    }
    private node head;
    private node tail;
    public void insert(int val){

            node n=new node(val);
            head=n;
            tail=n;

    }
    public void insertAtFirst(int val){
        if(head==null){
            insert(val);
        }
        node n=new node(val);
        tail.next=n;
        n.next=head;
        tail=n;
        head=n;

    }
}
