// Jay Nash 3/27/23
// This is an array based stack that can hold up to 100 items.

public class StackLL {
    private Node head;

    public StackLL(){ //Constructor
        head=null;
    }

    public Node top(){ //Returns Top of stack
        return head;
    }

    public Node pop(){ // Returns and removes top of stack
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        return temp;
    }

    public Node push(Node x){ // Adds item to top of stack and moves head pointer
        x.setNext(head);
        head = x;
        return head;
    }

    public boolean isEmpty(){ // Checks if stack is empty
        return head == null;
    }

    public void printStack() { // Prints Stack
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }
}
