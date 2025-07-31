package LinkedLists;

public class CustomLinkedList {
//    creating a node data type
    private class node {
        private int value;
        private node next;
        public node(int value){
            this.value=value;
        }
        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }


    private node head;
    private node tail;
    private int size;
    CustomLinkedList(){
        this.size=0;
    }
    public int gethead(){
       return head.value;
    }
    public int gettail(){
        return tail.value;
    }
    public int getsize(){
        return size;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void insertAtFirst(int value){
        node n=new node(value);
        n.next=head;
        head=n;
        if(tail==null){
            tail=head;
        }
        size++;

    }
    public void inserAtEnd(int value){
        if(tail==null){
            insertAtFirst(value);
            return;
        }
        node temp=head;
        node n=new node(value);
        tail.next=n;
        tail=n;
        size++;
    }
    public void insert(int index,int value){
        node temp=head;
        head=insertrec(value,index,temp);
        return ;
    }
    private node insertrec(int val,int index,node no){
        if(index==0){
            node temp=new node(val,no);
            size++;
            return temp;
        }

        no.next=insertrec(val,index-1,no.next);
        return no;
    }
    public void insertBetween(int value,int index){
        if(index>size){
            return ;
        }
        if(index==0){
            insertAtFirst(value);
        }else if(index==size){
            inserAtEnd(value);
        }else{
            node n=new node(value);
            node p=head;
            node q=head.next;
            int i=0;
            while(i!=index-1){
                p=p.next;
                q=q.next;
                i++;
            }
            p.next=n;
            n.next=q;
            size++;
        }
    }
    public void deleteAtFirst(){
//        node temp=head;
//        head=temp.next;
        if(head==null){
            tail=null;
        }
        head=head.next;
        size--;
    }
    public void deleteAtEnd(){
        node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public void deleteAtIndex(int index){
        if(index>size){
            System.out.println("index out of bound");
            return;
        }
        if(index==0){
            deleteAtFirst();
        }else if(index==size-1){
            deleteAtEnd();
        }else{
            node p=head;
            node q=head.next;
            for (int i = 1; i <index ; i++) {
                p=p.next;
                q=q.next;
            }
            p.next=q.next;
            size--;
        }
    }




}
