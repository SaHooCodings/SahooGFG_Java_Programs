/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    int max_level = 0;
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> res = new ArrayList<Integer>();
      leftViewUtil(res,root,1);
      return res;
    }
    void leftViewUtil(ArrayList<Integer>res, Node node,int level)
    {
        if(node==null) return;
        if(max_level<level)
        {
            res.add(node.data);
            max_level = level;
        }
        leftViewUtil(res, node.left, level+1);
        leftViewUtil(res, node.right, level+1);
    }
}
