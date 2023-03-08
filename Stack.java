import nodes.Node;

public class Stack {
    private Node head;

    public Stack(){
        head=null;
    }

    public Node top(){
        return head;
    }

    public Node pop(){
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        return temp;
    }

    public Node push(Node x){
        x.setNext(head);
        head = x;
        return head;
    }

    public boolean isEmptyStack(){
        return head == null;
    }
}
