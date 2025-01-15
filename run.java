import linkedLists.SinglyLinkedList;

public class run {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList(6);
        ll.print();

        ll.append(3);
        ll.append(5);
        ll.append(9);

        ll.print();

        ll.prepend(10);
        ll.prepend(2);
        ll.prepend(5);
        ll.prepend(8);


        ll.print();

        ll.reverse();

        ll.print();

        System.out.println(ll.findKthFromEnd(1).value);


    }
}
