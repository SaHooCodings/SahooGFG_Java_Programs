class Solution
{
    public static Node reverse(Node head, int k)
    {
        //Your code here
        if(head == null || k <= 1)
        {
            return head;
        }
        int ctr = 0;
        Node curr = head;
        while(curr != null && ctr < k)
        {
            curr = curr.next;
            ctr++;
        }
        Node prev = null;
        curr = head;
        int i = 0;
        while(curr != null && i < k)
        {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            i++;
        }
        if(curr != null)
        {
            head.next = reverse(curr, k);
        }
        return prev;
    }
}
