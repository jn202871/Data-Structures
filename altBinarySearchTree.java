// BST with a traverse of O(1) in exchange for increase from average O(ln(n)) to average O(ln(n)) + O(n-1) for insert and delete
public class altBinarySearchTree{
    private TreeNode root;
    private StringBuilder contentBuilder;
    private String contentString;

    public altBinarySearchTree(){ // Constructor
        root = null;
        contentBuilder = new StringBuilder();
    }

    public boolean isEmptyTree(){ // Returns T/F if BST is empty
        return root == null;
    }

    public TreeNode search(int key){ // Starts recursive function to find a node
        return searchr(root,key);
    }

    private TreeNode searchr(TreeNode node, int key){ // Recursivly finds function
        if (node==null){
            return null;
        } else if (key == node.getKey()){ //  If found return node
            return node;
        } else if (key < node.getKey()){ // If node value larger go left
            return searchr(node.getLeft(),key);
        } else {
            return searchr(node.getRight(),key); // If node value lower go right
        }

    }

    public void insert(TreeNode x){ // Inserts new node
        TreeNode temp = root;
        TreeNode parent = null;

        while (temp != null){ // Keeps track of parent node to current node
            parent=temp;
            if (x.getKey()<temp.getKey()){ // If else to find appropriate spot depending on value
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        if (parent==null){ // If tree is empty then root is the spot for the new node
            root = x;
        } else if (x.getKey() < parent.getKey()){ // If parent is larger than new node set as left child
            parent.setLeft(x);
        } else {
            parent.setRight(x); // If parent lower than new node set as right child
        }
        rebuild(); // Rebuilds content string due to changes in BST
    }

    public void delete(TreeNode node){ // Starts recursive delete function
    	int key = node.getKey();
        root = deleter(root,key);
        rebuild(); // Rebuilds content string due to changes in BST
    }

    private TreeNode deleter(TreeNode node, int key){ // Recursive delete function
        if (node == null) { // If there is no node to search from returns null
            return null;
        }

        if (key < node.getKey()) { // If key is lower than current node, look left
            node.setLeft(deleter(node.getLeft(), key));
        } else if (key > node.getKey()) { // If key is higher than current node, look right
            node.setRight(deleter(node.getRight(), key));
        } else {
            if (node.getLeft() == null) {
                return node.getRight(); // If node to be deleted has no left node, pull right node up, this will also catch a node to be deleted with no children, the right node will just be null
            } else if (node.getRight() == null) {
                return node.getLeft(); // If node to be deleted has no right node, pull left node up
            } else { // If node has two children find inorder successor and replace node with successor
            	TreeNode temp = node;
            	node = minKey(node.getRight()); // Find Inorder Successor
            	temp.setRight(deleter(temp.getRight(), node.getKey()));
            	node.setRight(temp.getRight());
            	node.setLeft(temp.getLeft());
            }
        }
        return node;
    }

    private TreeNode minKey(TreeNode x){ // Function to find minimum node from a starting point
        while (x.getLeft() != null){
            x = x.getLeft();
        }
        return x;
    }

    public String printTree() { // Prints and returns contentString
        System.out.println(contentString);
        return contentString;
    }
    
    public void rebuild(){ // Recursively appends node info to string builder
        contentBuilder.setLength(0);
        rebuildr(root);
        contentString = contentBuilder.toString();
    }

    private void rebuildr(TreeNode root){
        if (root != null){
            rebuildr(root.getLeft());
            contentBuilder.append("Node: " + root.getKey()+ "\n\n");
            if (root.getLeft() != null) {
	            contentBuilder.append("Left: " + root.getLeft().getKey() + " ");
            } else {
                contentBuilder.append("Left: null ");
            }
            if (root.getRight() != null) {
	            contentBuilder.append("Right: " + root.getRight().getKey() + "\n\n");
            } else {
                contentBuilder.append("Right: null\n\n");
            }
            rebuildr(root.getRight());
        }
    }
}
