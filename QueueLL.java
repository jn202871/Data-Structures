public class QueueLL {
    private Node head;

    public QueueLL(){ // Constructor
        head = null;
    }

    public Node front(){ // Returns front of queue
        return head;
    }

    public void printQueue() { // Interates over queue and prints
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }

    public Node dequeue(){ // Removes head node and moves head pointer
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        return temp;
    }

    public Node enqueue(Node x){ // Adds node to end of queue
        if (head == null){
            head = x;
        } else {
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(x);
        }
        return x;
    }

    public boolean isEmpty(){ // Returns T/F empty
        return head == null;
    }
}
