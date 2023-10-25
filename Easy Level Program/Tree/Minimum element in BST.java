class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) 
    {
        if(root == null)
        {
            return -1;
        }
        if(root.left == null)
        {
            return root.data;
        }
        int mini = 0;
        if(root.left != null)
        {
            mini = minValue(root.left);    
        }
        return mini;
    }
}
