public class QueueA {
    private Node array[];
    private int front = 0;
    private int n = 0;

    public QueueA(){ //Constructor
        array = new Node[100];
    }

    public Node front(){ //Returns array place 1
        return array[front];
    }

    public void printQueue() { //Prints Queue
        int tail = (front + n) % 100;
        System.out.println(front);
        System.out.println(tail);
        if (front <= tail) // Checks if the tail is not looped around the array
           for(int i = front; i < tail; i++) 
               System.out.println(array[i].getKey());
        else { // Sepereate system if it has to loop around array
           for(int i = front; i < 100; i++) 
               System.out.println(array[i].getKey());           
           for(int i = 0; i < tail; i++) 
               System.out.println(array[i].getKey());
        }          
    }

    public Node dequeue(){ // Dequeues and returns node
        Node temp = array[front];
        front = (front+1)%100;
        n = (n-1)%100;
        return temp;
    }

    public Node enqueue(Node x){ // Adds node
        int tail = (front + n)  % 100;
        array[tail] = x;
        n = (n+1)%100;
        return array[tail];
    }

    public boolean isEmpty(){ // Returns empty T/F
        return n == 0;
    }

    public int length(){ // Returns length
        return n;
    }
}
