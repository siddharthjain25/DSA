import java.util.LinkedList;

public class LinkedListInAction {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(45);
        list.insertFirst(1);
        list.insertFirst(6);
        list.insertLast(99);
        //list.insertAtParticularIndex(100, 3);
        //list.deleteFirst();
        //list.deleteLast();
        //list.delete(2);
        //System.out.println(list.find(1));
        list.display();
        list.insertRecursion(100, 5);
        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(45);
//        list.insertFirst(1);
//        list.insertFirst(6);
//        list.insertLast(99);
//        list.insert(45, 25);
//        list.display();
    }
}
