public class QueueA {
    private Node array[];
    private int front = 0;
    private int n = 0;

    public QueueA(){
        array = new Node[100];
    }

    public Node front(){
        return array[front];
    }

    public void printQueue() {
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

    public Node dequeue(){
        Node temp = array[front];
        front = (front+1)%100;
        n = (n-1)%100;
        return temp;
    }

    public Node enqueue(Node x){
        int tail = (front + n)  % 100;
        array[tail] = x;
        n = (n+1)%100;
        return array[tail];
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int length(){
        return n;
    }
}
