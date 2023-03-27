public class StackLL {
    private Node head;

    public StackLL(){
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

    public boolean isEmpty(){
        return head == null;
    }

    public void printStack() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }
}
