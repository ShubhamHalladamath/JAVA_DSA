package LinkedLists;
 class ListNode {
    public int value;
    public ListNode next;
    public  ListNode(int value){
        this.value=value;
    }
    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
    void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");

    }
 }
public class rough {
    public static void main(String[] args) {
      ListNode head=new ListNode(1);
      ListNode temp1=head;
        for (int i = 2; i <6; i++) {
             temp1.next=new ListNode(i);
             temp1=temp1.next;
        }
        head.display(head);
        ListNode middlenode=middle(head);
        ListNode fh=head;
        ListNode sh=middlenode.next;
        middlenode.next=null;
        sh=reverse(sh);
        head.display(fh);
        head.display(sh);
//        while(fh.next!=null && sh.next!=null){
//            ListNode temp=fh.next;
//            fh.next=sh;
//            fh=temp;
//            temp=sh.next;
//            sh.next=fh;
//            sh=temp;
//        }
//        if(fh!=null){
//            fh.next=null;
//        }
//        head.display(head);

    }
    public static ListNode middle(ListNode head){
        ListNode f=head;
        ListNode s=head;
        while(s!=null && s.next!=null){
            f=f.next;
            s=s.next.next;
        }
        return f;
    }
    public static ListNode reverse(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode present=head;
        if(present==null){
            return head;
        }
        ListNode prenext=head.next;
        while(prenext!=null){
            present.next=prev;
            prev=present;
            present=prenext;
            prenext=prenext.next;
            if(prenext==null){
                present.next=prev;
                return present;
            }
        }

        return head;
    }
 }

