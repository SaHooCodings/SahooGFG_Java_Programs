public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    Node prev = null;
    boolean isBST(Node node)
    {
        // code here.
        if(node!=null){
            if(!isBST(node.left)){
                return false;
            }
            if(prev!=null&&node.data<=prev.data)
            return false;
            
            prev=node;
            return isBST(node.right);
        }
        return true;
    }
}
