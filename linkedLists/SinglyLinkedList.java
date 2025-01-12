package linkedLists;

public class SinglyLinkedList{

    private Node head;
    private Node tail;
    private int length;

    public void print(){
        Node currentNode = this.head;

        while(currentNode != null){
            System.out.println(currentNode.value + " -->");
            currentNode = currentNode.nextNode;
        }
    }

    class Node{

        int value;
        Node nextNode;

        Node(int value){
            this.value = value;
            this.nextNode = null;
        }
    }

    public SinglyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


}