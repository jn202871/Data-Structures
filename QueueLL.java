// Jay Nash 3/27/23
// This is an array based queue that can hold up to 100 items.

public class QueueLL {
    private Node head;
    private int n = 0;

    public QueueLL(){ //Constructor
        head = null;
    }

    public Node front(){ // Returns head node
        return head;
    }

    public void printQueue() { // Prints queue
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }

    public Node dequeue(){ // Returns and removes head node while moving head pointer to next node
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        n--;
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
        n++;
        return x;
    }

    public boolean isEmpty(){ // Checks if queue is empty
        return head == null;
    }

    public int length(){ // Returns length of queue
        return n;
    }
}
