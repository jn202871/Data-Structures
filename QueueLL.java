public class QueueLL {
    private Node head;
    private int n = 0;

    public QueueLL(){
        head = null;
    }

    public Node front(){
        return head;
    }

    public void printQueue() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }

    public Node dequeue(){
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        n--;
        return temp;
    }

    public Node enqueue(Node x){
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

    public boolean isEmpty(){
        return head == null;
    }

    public int length(){
        return n;
    }
}
