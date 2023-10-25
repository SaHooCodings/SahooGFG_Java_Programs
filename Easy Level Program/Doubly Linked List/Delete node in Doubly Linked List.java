class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	    // Your code here
	    if(head == null && head.next == null) return null;
	    if(x == 1)
	    {
	        head = head.next;
	        return head;
	    }
	    int i = 1;
	    Node curr = head;
	    while(i < x)
	    {
	        curr = curr.next;
	        i++;
	    }
	    if(curr.prev == null)
	    {
	        curr.next.prev = curr.prev;
	    }
	    else
	    {
	        curr.prev.next = curr.next;
	    }
	    return head;
    }
}
