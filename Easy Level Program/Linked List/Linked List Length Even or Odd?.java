class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    int ctr = 0;
	    Node temp = head1;
	    while(temp != null)
	    {
	        ctr++;
	        temp = temp.next;
	    }
	    if(ctr%2 == 0)
	    return 0;
	    else
	    return 1;
	}
}
