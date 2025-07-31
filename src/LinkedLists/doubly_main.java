package LinkedLists;

public class doubly_main {
    public static void main(String[] args) {
        customDoublyLinkedList list2=new customDoublyLinkedList();
        for (int i = 0; i <9 ; i++) {
            list2.insertAtEnd(i);
        }
        list2.insertaftervalue(8,54);
        list2.display();
        System.out.println(list2.getsize());
        System.out.println("head:"+list2.gethead()+",tail:"+list2.gettail());
    }
}
