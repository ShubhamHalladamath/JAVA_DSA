package LinkedLists.questions;

public class Mergesort_LinkedList {
    private static class node{
        int val;
        node next;
        node(){
            this.val=0;
        }
        node(int val){
           this.val=val;
        }
        private static void display(node head){
            while(head!=null){
                System.out.print(head.val+"->");
                head=head.next;
            }
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
            node a,b,c,d,e,f;
           node head=new node(6);
           a=new node(5);
        b=new node(4);
        c=new node(3);
        d=new node(2);
        e=new node(1);
        f=new node(0);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
//        head.display(head);
        head= mergesort(head);



        head.display(head);


    }
    public static node mergesort(node head) {
        if (head == null || head.next == null) {
            return head;
        }

        node mid = middleNode(head);
        node nextToMid = mid.next;
        mid.next = null; // Split the list

        node left = mergesort(head);
        node right = mergesort(nextToMid);

        return merge(left, right);
    }



    public static node merge(node list1,node list2){
        node dummy=new node();
        node temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){

                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
                }

            else {

                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
            }


        temp.next=(list1!=null)? list1:list2;
        return dummy.next;
    }
    public static  node middleNode(node head) {
        node f=head;
        node s=head;
        node prev=s;
        while(f!=null && f.next!=null){
            f=f.next.next;
            prev=s;
            s=s.next;
        }
        return prev;
    }
}
