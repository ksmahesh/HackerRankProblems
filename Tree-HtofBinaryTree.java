/*
Tree: Height of a Binary Tree

The height of a binary tree is the number of edges between the tree's root and its furthest leaf. This means that a tree containing a single node has a height of 0.

Complete the height function provided in your editor so that it returns the height of a binary tree. This function has a parameter, root, which is a pointer to the root node of a binary tree.

Input Format:
You do not need to read any input from stdin. Our grader will pass the root node of a binary tree to your height function.

Output Format:
Your function should return a single integer denoting the height of the binary tree.

*/


   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
         if (root == null) {
             return -1;
         }
       return (1+max(height(root.left),height(root.right)));
    }
    int max (int x, int y) {
        if (x>y) {
            return x;
        } else {
            return y;
        }
    }