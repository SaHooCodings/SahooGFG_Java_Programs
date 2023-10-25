class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            Node temp = q.remove();
            list.add(temp.data);
            if(temp.left != null)
            {
                q.add(temp.left);
            }
            if(temp.right != null)
            {
                q.add(temp.right);
            }
        }
        return list;
    }
}
