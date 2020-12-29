# ListOfDepths
Exercise related with Trees and Graphs.

## Exercise Challenge
Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth (i. e., if you have a tree with depth D, you'll have D linked lists).

### Solution
My implementation is through a Breadth-First Search and taking into account in which level I am. 
Basically, I have a list for a certain level, then I go through this list in order to fill out the list of the next level with the children of the elements of the current list. 
This algorithm runs in O(N) time and space.