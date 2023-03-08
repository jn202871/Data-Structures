import nodes.Node;

// Gary Parker
// Test for Linked-List

public class TestList {
    public static void main(String[] args){
	List a = new List();
	List b = new List();
	List c = new List();
	Node xNode = new Node("Jane", 123456789);
	Node yNode = new Node("Joe", 934567890);
	Node zNode = new Node("Jack", 223452234);
	Node kNode = new Node("Jill", 934567856);
	Node aNode = new Node("Abe", 123456788);
	Node bNode = new Node("Beth", 934567898);
	Node cNode = new Node("Chuck", 223452238);
	// Node dNode = new Node("Dot", 934567858);
	a.insert(xNode);
	a.insert(yNode);
	a.insert(zNode);
	a.insert(kNode);
	a.printList();
	Node mNode = new Node("Mike", 723452237);
	Node nNode = new Node("Nick", 734567857);
	b.insert(mNode);
	b.insert(nNode);
	System.out.println("searchReturn");
	System.out.println(a.searchReturn(6789).getName());
	System.out.println(a.searchReturn(2234).getName());
	System.out.println(b.searchReturn(2237).getName());
	System.out.println(b.searchReturn(7857).getName());
	System.out.println("length");
	System.out.println(a.length());
	System.out.println("list a");
	a.printList();
	System.out.println("list b");
	b.printList();
	System.out.println("list a");
	a.printList();
	System.out.println("searchReturn 7890");
	System.out.println(a.searchReturn(7890));
	System.out.println("searchRemove7890");
	a.searchRemove(7890);
	System.out.println("searchReturn 7890");
	System.out.println(a.searchReturn(7890));
	a.printList();
	System.out.println("searchRemove6789");
	a.searchRemove(6789);
	a.printList();
	System.out.println("searchRemove7856");
	a.searchRemove(7856);
	a.printList();
	System.out.println("insert6788");
	a.insert(aNode);
	a.printList();
	System.out.println("insert7898");
	a.insert(bNode);
	a.printList();
	System.out.println("insert2238");
	a.insert(cNode);
	a.printList();
	System.out.println("isEmptyList = " + a.isEmptyList());
	System.out.println("length a: " + a.length());

	xNode = new Node("Jane", 123456789);
	yNode = new Node("Joe", 934567890);
	zNode = new Node("Jack", 223452234);
	System.out.println("insert z x y in c");
	c.insert(zNode);
	c.insert(xNode);
	c.insert(yNode);
	c.printList();
	System.out.println("searchRemove x y z in c");
	c.searchRemove(xNode.getKey());
	c.printList();
	c.searchRemove(yNode.getKey());
	c.printList();
	c.searchRemove(zNode.getKey());
	c.printList();
	System.out.println("isEmptyList = " + c.isEmptyList());
	System.out.println("length = " + c.length());
    }
}