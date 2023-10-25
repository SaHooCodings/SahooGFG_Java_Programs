class GfG
{
    boolean isCircular(Node head)
    {
	    // Your code here
	    Node temp = head.next;
	    if(head == null) return true;
	    while(temp != null && temp != head)
	    {
	        temp = temp.next;
	    }
	    return (temp == head);
    }
}
