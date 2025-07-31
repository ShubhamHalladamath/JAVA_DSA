package LinkedLists.questions;


import LinkedLists.CustomLinkedList;
// bubble sort algo or logic is in customlinkedlist2 in same package;
public class bubblesort_LinkedList{


    public static void main(String[] args) {
        CustomLinkedList2 list1=new CustomLinkedList2();
        for (int i = 5; i > 0; i--) {
            list1.inserAtEnd(i);
        }
        System.out.println(  list1.getsize());
        System.out.println("before sort");
        list1.display();
        System.out.println("after sort");
        list1.bubblesort();
        list1.display();
    }


}
