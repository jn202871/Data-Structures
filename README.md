# List.java
Makes a linked list and has various functions to facilitate the usage of the list.

List.length()
  returns length of list
  
List.searchReturn(int key)
  returns Node that corrosponds with the key
  
List.searchRemove(int key)
  returns and removes Node that corrosponds with the key
  
List.insert(Node node)
  appends node to linked list
  
List.printList()
  prints the entire list to console
  
List.isEmptyList()
  returns true or false if list is empty or not

# Stack.java
Makes a node based stack and has various functions to use the stack.

Stack.top()
  returns top of stack
  
Stack.pop()
  returns and deletes top of stack
  
Stack.push(Node node)
  adds node to top of stock
  
Stack.isEmptyStack()
  returns true or false if the stack is empty or not
  
# Queue.java
Makes a node based queue and has various functions to use the queue.

Queue.front()
  returns front of queue
  
Queue.dequeue()
  returns front of queue and then removes that node from the queue
  
Queue.enqueue(Node node)
  adds a node to the end of the queue
  
Queue.isEmptyQueue()
  returns true or false if the queue is empty or not
  
# BinarySearchTree.java
Impliments a binary search tree and has various functions to use the tree.

BinarySearchTree.search(key)
  searches tree and returns node with specified key
  
BinarySearchTree.insert(TreeNode node)
  inserts specified node into the tree, node structure is different from previous implimentations due to needing two pointers
  
BinarySearchTree.traverse()
  prints the entire tree
  
BinarySearchTree.delete(int key)
  deletes node with specified key and repairs any gaps in tree due to deletion
