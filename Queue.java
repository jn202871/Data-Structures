import nodes.Node;

public class Queue {
    private Node head;
    private Node tail;

    public Queue(){
        head = null;
        tail = null;
    }

    public Node front(){
        return head;
    }

    public Node dequeue(){
        Node temp = head;
        head = head.getNext();
        if (head == null){
            tail = null;
        }
        temp.setNext(null);
        return temp;
    }

    public Node enqueue(Node x){
        if (head == null){
            head = x;
            tail = x;
        } else {
            tail.setNext(x);
            tail = tail.getNext();
        }
        return x;
    }

    public boolean isEmptyQueue(){
        return head == null;
    }
}
