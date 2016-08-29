/*
Tree: Level Order Traversal

You are given a pointer to the root of a binary tree. You need to print the level order traversal of this tree. In level order traversal, we visit the nodes level by level from left to right. 
You only have to complete the function. 
For example:

         3
       /   \
      5     2
     / \    /
    1   4  6
For the above tree, the level order traversal is 3 -> 5 -> 2 -> 1 -> 4 -> 6.

Input Format:
You are given a function,
void level_order(node * root)
{

}

Output Format:
Print the values in a single line seperated by a space.

*/


   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
      Queue<Node> myQ = new LinkedList<Node>();
      
      myQ.add(root);
       while ( !myQ.isEmpty()) {
           Node temp = myQ.remove();
           System.out.print(temp.data+" ");
           if (temp.left != null) {
               myQ.add(temp.left);
           }
           if (temp.right != null) {
               myQ.add(temp.right);
           }
       }
    }
