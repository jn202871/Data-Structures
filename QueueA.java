// Jay Nash 3/27/23
// This is an array based queue that can hold up to 100 items.

public class QueueA {
    private Node array[];
    private int front = 0;
    private int n = 0;

    public QueueA(){ //Constructor
        array = new Node[100];
    }

    public Node front(){ // Returns front of queue
        return array[front];
    }

    public void printQueue() { // Prints queue
        int tail = (front + n) % 100;
        System.out.println(front);
        System.out.println(tail);
        if (front <= tail)
           for(int i = front; i < tail; i++) 
               System.out.println(array[i].getKey());
        else {
           for(int i = front; i < 100; i++) 
               System.out.println(array[i].getKey());           
           for(int i = 0; i < tail; i++) 
               System.out.println(array[i].getKey());
        }          
    }

    public Node dequeue(){ //  Returns and removes front of queue
        Node temp = array[front];
        front = (front+1)%100;
        n = (n-1)%100;
        return temp;
    }

    public Node enqueue(Node x){ // Adds node to end of queue
        int tail = (front + n)  % 100;
        array[tail] = x;
        n = (n+1)%100;
        return array[tail];
    }

    public boolean isEmpty(){ // Checks if queue is empty
        return n == 0;
    }

    public int length(){ // Returns length of queue
        return n;
    }
}
