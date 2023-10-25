class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow = head;
        Node fast = head;
        boolean loopExits = false;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                loopExits = true;
                break;
            }
        }
        if(loopExits)
        {
            slow = head;
            if(fast == slow)
            {
                while (fast.next != slow)
                {
                    fast = fast.next;
                }
                fast.next = null;
                return;
            }
            Node prev = null;
            while(slow != fast)
            {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            prev.next = null;
        }
    }
}
