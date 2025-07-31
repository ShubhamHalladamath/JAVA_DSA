package LinkedLists;
//import Stacks.customstack;
public class single_main {
    public static void main(String[] args) {

         CustomLinkedList list=new CustomLinkedList();
//         list.insertAtFirst(5);
//         list.insertAtFirst(10);
        list.insertAtFirst(0);
        for (int i = 1; i < 9; i++) {
            list.inserAtEnd(i);

        }
        list.insert(0,55);

//        list.deleteAtIndex(8);
//        System.out.println(  list.gethead());
        list.display();
        System.out.println( list.getsize());
//         list.inserAtEnd(55);
//        list.inserAtEnd(60);
//        list.inserAtEnd(66);
//        list.insertBetween(0,10);
//        list.display();
//        System.out.println("head-"+list.gethead());
//        System.out.println("tail-"+list.gettail());
//        System.out.println(list.getsize());
    }
}
