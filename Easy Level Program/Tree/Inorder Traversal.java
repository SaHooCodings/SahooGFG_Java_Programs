class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) 
    {
        // Code
        ArrayList<Integer> list = new ArrayList<>();
        preorderUtil(root, list);
        return list;
    }
    static void preorderUtil(Node root, ArrayList<Integer> list)
    {
        if(root == null) return;
        preorderUtil(root.left, list);
        list.add(root.data);
        preorderUtil(root.right, list);
    }
}
