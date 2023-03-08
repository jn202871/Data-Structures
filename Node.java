// Jay Nash 3/1/23
// Program to impliment Node class, class takes an input of a name and SSN and creates 
// a node with an empty pointer. The pointer can be assigned to another node using the
// setNext() method and the linked list can be followed using the getNext() method.

class Node {
	
	// Node information
	public Node next;
	public int key;
	private String name;
	private int ssn;
	
	// Creation Method
	public Node(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
		this.next = null;
		this.key = ssn % 10000;
	}
	
	// Returns Name
	public String getName(){
		return name;
	}
		
	// Returns SSN
	public int getSSN(){
		return ssn;
	}
	
	// Returns last 4 digits of SSN
	public int getKey(){
		return ssn % 10000;
	}
	
	// Sets name of node to argument
	public void setName(String name){
		this.name = name;
	}
	
	// Sets SSN of node to argument
	public void setSSN(int ssn){
		this.ssn = ssn;
	}
	
	// Sets pointer of node to argument
	public void setNext(Node next){
		this.next = next;
	}
	
}
