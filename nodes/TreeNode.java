package nodes;
public class TreeNode {
	
	// Node information
	private TreeNode right;
    private TreeNode left;
	private String name;
	private int ssn;
	
	// Creation Method
	public TreeNode(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
		this.right = null;
        this.left = null;
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
	public TreeNode setRight(TreeNode next){
		this.right = next;
		return this.right;
	}

	public TreeNode getRight(){
		return this.right;
	}

    // Sets pointer of node to argument
	public TreeNode setLeft(TreeNode next){
		this.left = next;
		return this.left;
	}

	public TreeNode getLeft(){
		return this.left;
	}

    public void transform(TreeNode target){
        this.name = target.getName();
        this.ssn = target.getSSN();
    }
	
}
