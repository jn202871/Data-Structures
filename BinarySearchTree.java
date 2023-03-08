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

    private TreeNode searchr(TreeNode root, int key){
        if (root==null){
            return null;
        } else if (key == root.getKey()){
            return root;
        } else if (key < root.getKey()){
            return searchr(root.getLeft(),key);
        } else {
            return searchr(root.getRight(),key);
        }

    }

    public void insert(TreeNode x){
        insertr(root,x);
    }

    private TreeNode insertr(TreeNode root, TreeNode x){
        if (root == null) {
            root = x;
        } else if (x.getKey() < root.getKey()) {
            root.setLeft(insertr(root.getLeft(), x));
        } else if (x.getKey() > root.getKey()) {
            root.setRight(insertr(root.getRight(), x));
        }
        return x;
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

    private TreeNode deleter(TreeNode root, int key){
        if (root == null) {
            return null;
        }

        if (key < root.getKey()) {
            root.setLeft(deleter(root.getLeft(), key));
        } else if (key > root.getKey()) {
            root.setRight(deleter(root.getRight(), key));
        } else {
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }
            TreeNode temp = minKey(root.getRight());
            root.transform(temp);

            // Delete the inorder successor
            delete(temp.getKey());
        }

        return root;
    }

    private TreeNode minKey(TreeNode x){
        while (x.getLeft() != null){
            x = x.getLeft();
        }
        return x;
    }
}
