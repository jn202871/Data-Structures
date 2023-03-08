// Jay Nash
// Test for BSE

public class TestBSE {
    public static void main(String[] args){
	BinarySearchTree a = new BinarySearchTree();
	TreeNode xTreeNode = new TreeNode("Jane", 123456789);
	TreeNode yTreeNode = new TreeNode("Joe", 934567890);
	TreeNode zTreeNode = new TreeNode("Jack", 223452234);
	TreeNode kTreeNode = new TreeNode("Jill", 934567856);
	TreeNode aTreeNode = new TreeNode("Abe", 123456788);
	TreeNode bTreeNode = new TreeNode("Beth", 934567898);
	TreeNode cTreeNode = new TreeNode("Chuck", 223452238);
	// TreeNode dTreeNode = new TreeNode("Dot", 934567858);
	a.insert(xTreeNode);
	a.insert(yTreeNode);
	a.insert(zTreeNode);
	a.insert(kTreeNode);
	a.traverse();
	TreeNode mTreeNode = new TreeNode("Mike", 723452237);
	TreeNode nTreeNode = new TreeNode("Nick", 734567857);
	a.insert(mTreeNode);
	a.insert(nTreeNode);
	System.out.println("search");
	System.out.println(a.search(6789).getName());
	System.out.println(a.search(2234).getName());
	System.out.println("list a");
	a.traverse();
	System.out.println("search 7890");
	System.out.println(a.search(7890));
	System.out.println("searchRemove7890");
	a.delete(7890);
	System.out.println("search 7890");
	System.out.println(a.search(7890));
	a.traverse();
	System.out.println("searchRemove6789");
	a.delete(6789);
	a.traverse();
	System.out.println("searchRemove7856");
	a.delete(7856);
	a.traverse();
	System.out.println("insert6788");
	a.insert(aTreeNode);
	a.traverse();
	System.out.println("insert7898");
	a.insert(bTreeNode);
	a.traverse();
	System.out.println("insert2238");
	a.insert(cTreeNode);
	a.traverse();
	System.out.println("isEmptyList = " + a.isEmptyTree());
    }
}