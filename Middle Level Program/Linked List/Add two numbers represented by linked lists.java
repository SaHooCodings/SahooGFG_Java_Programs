class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node temp1 = rev(first);
        Node temp2 = rev(second);
        
        Node sum = null;
        int carry = 0;
        
        while(temp1 != null || temp2 != null || carry > 0)
        {
            int val = carry;
            if(temp1 != null)
            {
                val += temp1.data;
            }
            if(temp2 != null)
            {
                val += temp2.data;
            }
            carry = val/10;
            val = val%10;
            
            Node newNode = new Node(val);
            newNode.next = sum;
            sum = newNode;
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }
        return sum;
    }
    static Node rev(Node head)
    {
        Node prev = null;
        Node nxt = null;
        Node curr = head;
        while(curr != null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
