# interviews
## Data Structures
### Arrays
* *Array* -- Collection of elements identified by index
* Element indices can be computed at run time
* Fixed size - no insertion/deletion, only modify existing values
* Random access via index
* **Two-Dimensional Array:** sequence of elements as a matrix rather than linear
  * In Java: Actually a 1D array which contains *M* elements, each of which is an array of *N* integers
* Time Complexity:
  * Access: `O(1)`
  * Search: `O(n)`
  * Insert: `O(n)`
  * Remove: `O(n)`

### ArrayList / Dynamic Array
* *ArrayList* -- array that allows elements to be added or removed
* Variable size - can grow or shrink if objects are added/removed
* Can't be used for primitive types
* When inserting on a full list - a new array is created with double the capacity and all elements from old array are copied to new array
* Insert actually runs in *amortized constant time*
  * A small percentage of inserts will take longer, but overall complexity is still `O(1)`
* Time Complexity:
  * Access: `O(1)`
  * Search: `O(n)`
  * Insert: `O(1)`
  * Remove: `O(n)`

### Linked List
* *Linked List* -- A linear collection of data elements where each element points to the next with pointers. In basic implementation, each node contains data and a reference to the next node in the sequence.
* Elements can be easily inserted or removed without reallocation or reorganization of the entire structure because elements are not necessarily stored contiguously in memory or on disk
* No random access -- only sequential access
* Use more memory than arrays because of pointers
* **Singly Linked List:** Each node has one pointer - next, last node points to null
* **Doubly Linked List:** Each node has two pointers - next and prev, last node points to null
* **Circular Linked List:** Each node has one pointer - next, last node points to first node
* Time Complexity (Same for singly and doubly linked):
  * Access: `O(n)`
  * Search: `O(n)`
  * Insert: `O(1)`
  * Remove: `O(1)`

### Stack (LIFO)
* *Stack* -- Collection of elements with two principal operations:
  * **push:** adds element to the collection
  * **pop:** removes most recently added element
* *peek* operation can give access to the top element without modifying the stack
* *push* and *pop* only occur at the top of the stack
* Easily implemented with an array or linked list
* Time Complexity:
  * Access: `O(n)`
  * Search: `O(n)`
  * Insert: `O(1)`
  * Remove: `O(1)`

### Queue (FIFO)
* *Queue* -- Collection of elements with two principal operations:
  * **enqueue:** adds element to end of queue
  * **dequeue:** removes element from front of queue
* First element added will be first removed
* *peek* operation can give access to the top element without dequeuing
* Can be implemented with an array or linked list
  * Make array circular by letting head and tail drift around
    * With array size *n*, computing indices % *n* will turn array into a circle
* Time Complexity:
  * Access: `O(n)`
  * Search: `O(n)`
  * Insert: `O(1)`
  * Remove: `O(1)`
* **Deque:** Double-Ended queue where elements can be added or removed from *either* the front or back
  * Implemented with a modified ArrayList or Doubly Linked List
* **Priority Queue:** Like a regular queue but each element has a priority associated with it
  * Element with high priority is dequeued before an element with low priority
  * If two elements have the same priority, they are served according to their order in the queue
  * *peek* operation returns highest-priority element without modifying queue
  * Can be implemented with a heap
    * `O(log(n))` inserts and removals
    * `O(n)` to initialize
  * Can also be implemented with self-balancing BST

### Binary Heap
* *Heap* -- A complete binary tree which satisfies the heap ordering property
  * Highest (or lowest) priority element is always stored at the root
  * Partially ordered
* **Min Heap:** Value of each node is greater than or equal to the value of its parent, with min value element at the root
* **Max Heap:** Value of each node is less than or equal to the value of its parent, with max value element at the root
* Time Complexity:
  * Insert: `O(log(n))`
  * Remove: `O(log(n))`

-------------------------------------------------------------------
# WIP 
### Trees
* **Binary Tree:**
* **N-Ary Tree:**

#### Binary Search Tree
* *Binary Search Tree* --
* Time Complexity:
  * Access: `O(log(n))`
  * Search: `O(log(n))`
  * Insert: `O(log(n))`
  * Remove: `O(log(n))`

#### Red Black Tree
* *Red Black Tree* --
* Time Complexity:
  * Access: `O(log(n))`
  * Search: `O(log(n))`
  * Insert: `O(log(n))`
  * Remove: `O(log(n))`

#### AVL Tree
* *AVL Tree* --
* Time Complexity:
  * Access: `O(log(n))`
  * Search: `O(log(n))`
  * Insert: `O(log(n))`
  * Remove: `O(log(n))`


### Hash Table
* *Hash Table* --
* Time Complexity:
  * Access: `N/A`
  * Search: `O(1)`
  * Insert: `O(1)`
  * Remove: `O(1)`

#### Collisions


### Trie

### Hash Map
#### Linked Hash Map

### Graphs
#### Undirected
#### Directed
#### Weighted

## Algorithms

### Sorting
#### Quick Sort
#### Merge Sort
#### Bucket Sort
#### Radix Sort


### Tree Traversals
#### DFS
##### Recursive
##### Iterative
#### In-Order
#### Pre-Order
#### Post-Order

### Traversals
#### Dijkstra

## Dynamic Programming
### Backtracking

## Bit Manipulation

## Etc
-------------------------------------------------------------------
> Data structure defintions from Wikipedia, time complexities from http://bigocheatsheet.com/

