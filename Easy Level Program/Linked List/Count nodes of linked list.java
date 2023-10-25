class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        int ctr = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            ctr++;
        }
        return ctr;
    }
}
    
