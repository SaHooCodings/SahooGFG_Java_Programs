class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> list = new ArrayList<>();
       postorderUtil(root, list);
       return list;
    }
    static void postorderUtil(Node root, ArrayList<Integer> list)
    {
        if(root == null) return;
        postorderUtil(root.left, list);
        postorderUtil(root.right, list);
        list.add(root.data);
    }
}
