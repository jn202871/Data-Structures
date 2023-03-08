// Jay Nash 3/8/23
// Program to impliment Linked List, list is created by creating a pointer to null and int n to 0
// Nodes can be added using the insert function and can be found to be returned or deleted using searchRemove
// or searchReturn. The entire list can be interated over and printed using printList and it can be found if the
// list is empty using isEmptyList.

public class List {
	private Node head; // Head Pointer
	private int n; // Number of Nodes in List

	public List() { // Constructor of List
		this.head = null;
		this.n = 0;
	}
	
	public int length(){ // Returns N as it is the length of the List
		return this.n;
	}
	
	public boolean isEmptyList(){ // Checks if N is 0
		return this.n == 0;
	}
	
	public Node searchReturn(int key){ // returns node with specified key
		Node temp = this.head;
		while (temp != null){
			if (temp.key == key) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public Node searchRemove(int key){ // Returns and removes node with specified key
		Node lastTemp = null;
		Node temp = this.head;
		while (temp != null) {
			if (temp.key == key) {
				if (lastTemp == null) {
					this.head = temp.next;
				} else {
					lastTemp.setNext(temp.next);
				}
				this.n--;
				return temp;
			}
			lastTemp = temp;
			temp = temp.next;
		}
		return null;
	}
	
	public void insert(Node x){ // Appends specified Node to list
		x.setNext(this.head);
		this.head = x;
		this.n++;
	}
	
	public void printList(){ // Prints entire list
		Node temp = this.head;
		System.out.println(this.n);
		while (temp != null){
			System.out.println(temp.key);
			temp = temp.next;
		}
	}
}

