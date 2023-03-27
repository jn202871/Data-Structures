public class StackA {
    private Node array[];
    private int top = 0;
    private int n = 0;

    public StackA(){
        array = new Node[100];
    }

    public Node top(){
        return array[(top-1)%100];
    }

    public Node pop(){
        top = (top-1)%100;
        n--;
        return array[top];
    }

    public Node push(Node x){
        array[top] = x;
        top = (top+1)%100;
        n++;
        return x;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void printStack() {
        System.out.println(n);
      for(int i = top-1; i >= 0; i--) {
             System.out.println(array[i].getKey());
        }
     }
}
