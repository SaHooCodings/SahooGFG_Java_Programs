class Solution
{
	int countNonLeafNodes(Node root) {
	    //code here
	    if(root == null) return 0;
	    else if(root.left == null && root.right == null)
	    {
	        return 0;
	    }
	    return countNonLeafNodes(root.left) + countNonLeafNodes(root.right) + 1;
	}
}
