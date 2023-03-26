// Node with one child node
public class Node {
	
	// Node information
	private Node next;
	private String name;
	private int ssn;
	
	// Creation Method
	public Node(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
		this.next = null;
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

	public Node getNext(){
		return this.next;
	}
	
}
