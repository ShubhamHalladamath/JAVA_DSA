package LinkedLists;

public class customDoublyLinkedList {
    private class node{
        int val;
        node next;
        node prev;
        node(int val){
            this.val=val;
        }
        node(int val,node next,node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
    private node head;
    private node tail;
    private int size;

    customDoublyLinkedList(){
        this.size=0;
    }
    public int gethead(){
        return head.val;
    }


    public int gettail(){
       return tail.val;
    }
    public int getsize(){
        return size;
    }
    public void display(){
        node temp=head;
        System.out.print("start<->");
        while(temp!=null){
            System.out.print(temp.val+"<->");
            temp=temp.next;
        }
        System.out.println("end");

    }
    public void inserAtFirst(int val){
        node n=new node(val);
        if(tail==null){

            n.prev=null;
            n.next=null;
            head=n;
            tail=head;
            size++;
        }else{
            node temp=head;
            temp.prev=n;
            n.next=temp;
            n.prev=null;
            head=n;
            size++;
        }

    }
    public void insertAtEnd(int val){
        node n=new node(val);
        if(tail==null){
            inserAtFirst(val);
            return;
        }else{
            n.prev=tail;
            tail.next=n;
            n.next=null;
            tail=n;
            size++;
        }
    }
    public void inserAtbetween(int index,int val){
        node n=new node(val);
        node p=head;
        int i=0;
        if(index==size){
            insertAtEnd(val);
            return;
        }
        if(index==0){
            inserAtFirst(val);
            return;
        }

        while(i!=index-1){
            p=p.next;
            i++;
        }
        node q=p.next;
        n.next=q;
        p.next=n;
        n.prev=p;
        q.prev=n;


        size++;
    }
    public void insertaftervalue(int val,int num){
        node temp=head;

            int i=0;
            while(temp.val!=val){
                temp=temp.next;
                i++;
                if(temp==null){
                    System.out.println("no val found");
                    return;
                }
            }
            if(temp.val==val){
            inserAtbetween(i+1,num);
            return;
            }


    }
}
