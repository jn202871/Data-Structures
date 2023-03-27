// Jay Nash 3/27/23
// This is an array based stack that can hold up to 100 items.

public class StackA {
    private Node array[];
    private int top = 0;
    private int n = 0;

    public StackA(){ //Constructor
        array = new Node[100];
    }

    public Node top(){ //Returns Top of stack
        return array[(top-1)%100];
    }

    public Node pop(){ // Returns and removes top of stack
        top = (top-1)%100;
        n--;
        return array[top];
    }

    public Node push(Node x){ // Adds item to top of stack and pushes previous top back
        array[top] = x;
        top = (top+1)%100;
        n++;
        return x;
    }

    public boolean isEmpty(){ // Checks if stack is empty
        return n == 0;
    }

    public void printStack() { // Prints Stack
        System.out.println(n);
      for(int i = top-1; i >= 0; i--) {
             System.out.println(array[i].getKey());
        }
     }
}
