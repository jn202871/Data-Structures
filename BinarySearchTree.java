public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(){
        root = null;
    }

    public boolean isEmptyTree(){
        return root == null;
    }

    public TreeNode search(int key){
        return searchr(root,key);
    }

    private TreeNode searchr(TreeNode node, int key){
        if (node==null){
            return null;
        } else if (key == node.getKey()){
            return node;
        } else if (key < node.getKey()){
            return searchr(node.getLeft(),key);
        } else {
            return searchr(node.getRight(),key);
        }

    }

    public void insert(TreeNode x){
        TreeNode temp = root;
        TreeNode parent = null;

        while (temp != null){
            parent=temp;
            if (x.getKey()<temp.getKey()){
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        if (parent==null){
            root = x;
        } else if (x.getKey() < parent.getKey()){
            parent.setLeft(x);
        } else {
            parent.setRight(x);
        }
    }

    public void traverse(){
        traverser(root);
    }

    private void traverser(TreeNode root){
        if (root != null){
            traverser(root.getLeft());
            System.out.println(root.getName());
            traverser(root.getRight());
        }
    }

    public void delete(int key){
        deleter(root,key);
    }

    private TreeNode deleter(TreeNode node, int key){
        if (node == null) {
            return null;
        }

        if (key < node.getKey()) {
            node.setLeft(deleter(node.getLeft(), key));
        } else if (key > node.getKey()) {
            node.setRight(deleter(node.getRight(), key));
        } else {
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            }
            TreeNode temp = minKey(node.getRight());
            node.transform(temp);

            // Delete the inorder successor
            delete(temp.getKey());
        }

        return node;
    }

    private TreeNode minKey(TreeNode x){
        while (x.getLeft() != null){
            x = x.getLeft();
        }
        return x;
    }
}
