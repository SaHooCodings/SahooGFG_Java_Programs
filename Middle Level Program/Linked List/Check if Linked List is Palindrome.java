class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head == null || head.next == null)
        {
            return true;
        }
        Node slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow);
        Node firstHalf = head;
        while(secondHalf != null)
        {
            if(firstHalf.data != secondHalf.data)
            return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    Node reverse(Node head)
    {
        Node prev = null, vurr = head, nxt = null;
        while(vurr != null)
        {
            nxt = vurr.next;
            vurr.next = prev;
            prev = vurr;
            vurr = nxt;
        }
        return prev;
    }
}
