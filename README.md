# interviews

--------
WIP
--------


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

### Hash Table
* *Hash Table* -- organizes data using hash functions to support quick insertion and search
* Synchronized
* Thread safe
* Does not allow null values
* Time Complexity:
  * Access: `N/A`
  * Search: `O(1)`
  * Insert: `O(1)`
  * Remove: `O(1)`

### Hash Map
* *Hash Map* -- structure that can map keys to values
* Uses a hash function to compute an index into an array of buckets/slots from which the desired value can be found
* Not synchronized
* Not thread safe
* Allows null for both key and value
* Example: {1 -> "a", 2 -> "b", 3 -> "c", 4 -> "d"}

### Linked Hash Map
* *Linked Hash Map* -- just like HashMap but maintains the order of the elements inserted into it
  * Elements can be accessed in insertion order
* Implements Map Interface and extends HashMap class

### Hash Set
* *Hash Set* -- structure to store distinct elements
* Implements Set Interface
* Example: {"a", "b", "c", "d"}

#### Collisions
* Happen when the hash function generates the same index for more than one key
* **Collision Resolution:**
  * Separate Chaining
    * Each bucket is independent and has some sort of list of entries with the same index
    * The time for hash table operations = the time to find the bucket (**constant**) + time for list operation
  * Open Addressing
    * All entry records are stored in the bucket array itself
    * When a new entry has to be inserted, buckets are examined starting with the hashed-to slot and proceeding in a probe sequence until an unoccupied slot is found
    * "Open Addressing" refers to the fact that the location ("address") of the item is *not* determined by its hash value

### Trees
* *Tree* -- undirected, connected, acyclic graph
* **Binary Tree:** A tree data structure in which each node has at *most* two children
  * *Full Binary Tree:* Every node has either 0 or 2 children
  * *Perfect Binary Tree:* All interior nodes have 2 children and all leaves have the same depth
  * *Complete Binary Tree:* Every level (except maybe the last) is completely filled and all nodes in the last level are as far left as possible
  * *Balanced Binary Tree:* Has the minimum possible depth for leaf nodes
* **N-Ary Tree:** A rooted tree in which each node has no more than *N* children
  * https://leetcode.com/articles/introduction-to-n-ary-trees/

#### Binary Search Tree
* *Binary Search Tree* -- type of binary tree which maintains the property that the left subtree of a node contains only nodes with keys lesser than or equal to the node's key and the right subtree of a node contains only nodes with keys greater than the node's key
* Time Complexity:
  * Access: `O(log(n))`
  * Search: `O(log(n))`
  * Insert: `O(log(n))`
  * Remove: `O(log(n))`

#### Red Black Tree
* *Red Black Tree* -- self-balancing BST where each node has an extra bit representing the color of the node (red or black). The colors are used to ensure the tree remains balanced during insertions and deletions
* Root and leaves are generally black
* If a node is red, then both its children are black
* The path from the root to the farthest leaf is no more than twice as long as the path from the root to the nearest leaf
* Shortest possible path has all black nodes
* Longest possible path alternates between red and black nodes
* Time Complexity:
  * Access: `O(log(n))`
  * Search: `O(log(n))`
  * Insert: `O(log(n))`
  * Remove: `O(log(n))`

#### AVL Tree
* *AVL Tree* -- self-balancing BST where the heights of the two child subtrees of any node differ by at most one
* For lookup-intensive applications, faster than Red Black trees because they are more strictly balanced  
* Time Complexity:
  * Access: `O(log(n))`
  * Search: `O(log(n))`
  * Insert: `O(log(n))`
  * Remove: `O(log(n))`

### Trie
* *Trie* -- A kind of search tree used to store a dynamic set of associative array where the keys are usually strings
  * Also called *radix tree* or *prefix tree*
* No node in the tree stores the key associated with that node
  * Instead the position in the tree defines the key with which it is associated
* All descendants of a node have a common prefix of the string associated with that node
* Root is associated with the empty string
* Keys are not necessarily associated with every node

### Graphs
* *Graph* -- non-linear data structure consisting of a pair of sets (V, E), where V is the set of vertices and E is the set of edges connecting the pairs of vertices
* **Undirected Graph:** Edges don't have a specific direction (two-way)
* **Directed Graph:** Edges have a specific direction
* **Weighted Graph:** Edges have an associated value, or *weight*
  * Weight of edge also called "cost" of the edge\

## Algorithms
### Sorting
#### Quick Sort
* Divide and Conquer algorithm
* Picks element as pivot and partitions given array around the picked pivot
* Time Complexity:
  * Best: `O(n log(n))`
  * Average: `O(n log(n))`
  * Worst: `O(n^2)`
* Space Complexity: `O(log(n))`

#### Merge Sort
* Divide and Conquer algorithm
* Divides array in 2 halves, sorts the two halves recursively and then merges the results
* Time Complexity:
  * Best: `O(n log(n))`
  * Average: `O(n log(n))`
  * Worst: `O(n log(n))`
* Space Complexity: `O(n)`

#### Heap Sort
* Repeatedly find maximum element and place it at the end
* Time Complexity:
  * Best: `O(n log(n))`
  * Average: `O(n log(n))`
  * Worst: `O(n log(n))`

#### Insertion Sort
* Loop over array (from beginning) and repeatedly compare next element with current sub-array and inserting new element in correct position
* Time Complexity:
  * Best: `O(n)`
  * Average: `O(n^2)`
  * Worst: `O(n^2)`

#### Bucket Sort
* Distributes elements of an array into buckets and then sort each bucket individually, then put all elements back together
* Time Complexity:
  * Best: `O(n + k)`
  * Average: `O(n + k)`
  * Worst: `O(n^2)`

#### Radix Sort
* Sorts integers by grouping by individual digits of integers which share the same significant position and value
* Time Complexity:
  * Best: `O(nk)`
  * Average: `O(nk)`
  * Worst: `O(nk)`

#### Bubble Sort
* Repeatedly compares adjacent elements and places in correct order
* Time Complexity:
  * Best: `O(n)`
  * Average: `O(n^2)`
  * Worst: `O(n^2)`

### Traversals
#### DFS
* Traverse tree or graph starting at root node (or arbitrary graph node) and traverse as far as possible along each branch before traversing back up
* Use boolean visited array with graphs

#### In-Order
  1. Traverse the left subtree, i.e., Inorder(left-subtree)
  2. Visit the root.
  3. Traverse the right subtree, i.e., Inorder(right-subtree)

#### Pre-Order
  1. Visit the root.
  2. Traverse the left subtree, i.e., Preorder(left-subtree)
  3. Traverse the right subtree, i.e., Preorder(right-subtree)

#### Post-Order
  1. Traverse the left subtree, i.e., Postorder(left-subtree)
  2. Traverse the right subtree, i.e., Postorder(right-subtree)
  3. Visit the root.

#### BFS
* Traverse tree starting at root and visit all neighbor nodes at the same depth before moving onto next depth level
* Use boolean visited array with graphs

### Dijkstra
* Find shortest path between nodes in a graph

## Dynamic Programming
### Backtracking

## Bit Manipulation

## Common Patterns in LeetCode problems
* https://medium.com/leetcode-patterns
### Sliding Window
* https://discuss.leetcode.com/topic/68976/sliding-window-algorithm-template-to-solve-all-the-leetcode-substring-search-problem
* 

## Etc
* Clarifying questions:
  * How big is the size of the input?
  * How big is the range of values?
  * What kind of values are there? Are there negative numbers? Floating points? Will there be empty inputs?
  * Are there duplicates within the input?
  * What are some extreme cases of the input?
  * How is the input stored? If you are given a dictionary of words, is it a list of strings or a trie?
* What if input is too big to fit in memory?
  * Break the data into chunks and process each chunk at a time to reduce the number of disk accesses
  * Looking for a distributed solution
  

* https://medium.com/leetcode-patterns
* https://github.com/yangshun/tech-interview-handbook
* https://github.com/Twipped/InterviewThis
* https://github.com/donbeave/interview 
* https://www.reddit.com/r/cscareerquestions/comments/1jov24/heres_how_to_prepare_for_tech_interviews/
* https://www.quora.com/Google-Interview-Questions/How-should-I-prepare-for-my-Google-interview-if-I-have-1-month-left-and-I%E2%80%99m-applying-for-a-software-engineer-role
* https://www.programcreek.com/2012/11/top-10-algorithms-for-coding-interview/ 


-------------------------------------------------------------------
> Data structure defintions from Wikipedia, time complexities from http://bigocheatsheet.com/
