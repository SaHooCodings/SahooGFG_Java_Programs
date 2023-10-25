class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root != null)
        {
            list.add(root.data);
            list.addAll(preorder(root.left));
            list.addAll(preorder(root.right));
        }
        return list;
    }

}
