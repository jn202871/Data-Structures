public class Heap {
	private Node[] array = new Node[128];
	private int root = 0;
	private int n;
	
	public Heap(){
		n = 0;
	}
	
	public boolean isEmpty(){
		return (n == 0);
	}
	
	public int findMin(){
		return array[root].getKey();
	}
	
	private int parent(int child) { 
		return ((child-1)/2);
	} 
	
	private int leftChild(int parent) { 
	if (parent != 0) { 
		return (parent*2);
	} else return 1;
	}
	
	private int rightChild(int parent) { 
	if (parent != 0) { 
		return (parent*2+1);
	} else return 2;
	}
	
	private boolean isLeaf(int target) { return (target > n/2); }
	
	private void swap(int origin, int target){
		Node temp = array[target];
		array[target] = array[origin];
		array[origin] = temp;
	}
	
	public Node insert(Node node){
		int temp = n;
		array[n++] = node;
		while (array[temp].getKey() < array[parent(temp)].getKey()) {
			swap(temp, parent(temp));
			temp = parent(temp);
		}
		return node;
	}
	
	public Node deleteMin(){
		Node temp = array[root];
		array[root] = array[--n];
		deleteCheck(root);
		return temp;
	}
		
		
	private void deleteCheck(int temp){
		if (isLeaf(temp) == false){
			int nextLow = temp;
			if (rightChild(temp) <= n) {
				nextLow = array[leftChild(temp)].getKey() < array[rightChild(temp)].getKey() ? leftChild(temp):rightChild(temp);
			} else nextLow = leftChild(temp);
			if (array[nextLow] != null){
				if (array[nextLow].getKey() < array[temp].getKey()) {
					swap(temp, nextLow);
					temp = nextLow;
					deleteCheck(temp);
				}
			}
		}
	}
	
	public void printHeap() {
		for (int i = 0; i < n; i++) {
		System.out.println(array[i].getKey());
		}
    	}
}
