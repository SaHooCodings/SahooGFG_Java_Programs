class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node temp1 = head1;
         Node temp2 = head2;
         while(temp1 != temp2)
         {
             temp1 = (temp1 != null)?temp1.next:head2;
             temp2 = (temp2 != null)?temp2.next:head1;
         }
         if(temp1 == null || temp2 == null)
         {
             return -1;
         }
         else
         {
             return temp1.data;
         }
	}
}
