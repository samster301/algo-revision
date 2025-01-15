package linkedLists;

public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public class Node {

        public int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
            this.nextNode = null;
        }
    }

    public SinglyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void print() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.value + " --> ");
            currentNode = currentNode.nextNode;
        }
        System.out.println(" ");
    }

    public void append(int value) {
        Node newNode = new Node(value);

        tail.nextNode = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        newNode.nextNode = head;
        head = newNode;
        length++;
    }

    public int removeLast() {
        Node currentNode = head;
        Node deletedNode = null;

        if (head != tail) {
            while (currentNode.nextNode != tail) {
                currentNode = currentNode.nextNode;
            }
            deletedNode = currentNode.nextNode;
            tail = currentNode;
            currentNode.nextNode = null;
            length--;

        } else {
            if(head != null){
                deletedNode = head;
                head = tail = null;
                length--;
            }
        }
        return (deletedNode != null) ? deletedNode.value : 0;
    }

    public Node get(int index){
        int currIndex = 0;
        Node currNode = head;
        if(index >= length){
            System.out.println("Index out of bounds");
        }
        else {
            while(currIndex != index){
                currNode = currNode.nextNode;
                currIndex++;
            }
        }
        return currNode;
    }
    public void reverse(){
        Node sliderTo = head;
        Node sliderFrom = head;
        Node lookAhead = head;
        sliderFrom = sliderFrom.nextNode;
        lookAhead = sliderFrom.nextNode;
        sliderTo.nextNode = null;
        sliderFrom.nextNode = sliderTo;

         while(lookAhead != tail){
            sliderTo = sliderFrom;
            sliderFrom = lookAhead;
            lookAhead = lookAhead.nextNode;
            sliderFrom.nextNode = sliderTo;
        }
        lookAhead.nextNode = sliderFrom;
         tail = head;
        head = lookAhead;

    }

    public Node findMiddleNode(){
        Node slowIndex = head;
        Node fastIndex = head;
        int fastCntr = 0;

        while(fastIndex != tail){
            if(fastCntr%2 ==0){
                slowIndex = slowIndex.nextNode;
            }
            fastIndex = fastIndex.nextNode;
            fastCntr++;
        }
        return slowIndex;
    }

    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;
        int fastCntr = 0;


        while(fast != tail){
            if(fastCntr%2 ==0)
                slow = slow.nextNode;
            fast = fast.nextNode;
            fastCntr++;

            if(fast.equals(slow) && (fastCntr > 1))
                return true;
        }
        return false;
    }

    public Node findKthFromEnd(int k){
        Node firstPointer = head;
        Node followerPointer = head;
        int lengthCtr = 1;

        while(firstPointer != tail){
            firstPointer = firstPointer.nextNode;
            lengthCtr++;
        }
        if(k > lengthCtr)
            return null;

        for(int i=0; i < lengthCtr-k ; i++)
            followerPointer = followerPointer.nextNode;

        return followerPointer;

    }

    public void partitionList(int x){
        Node temp = head;
        Node partition = head;
        Node traverser = head;

        while(traverser.value >= x){
            head = traverser;
            traverser = traverser.nextNode;
        }

        while(traverser.nextNode != null){
            if(traverser.value >= x){
                partition = traverser;
                traverser = traverser.nextNode;
            }
            else {

            }
        }
    }

}