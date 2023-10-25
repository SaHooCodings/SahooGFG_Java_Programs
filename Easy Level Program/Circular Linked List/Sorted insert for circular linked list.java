class Solution
{
	public static Node sortedInsert(Node head,int data)
    {
            //add code here.
        Node newNode = new Node(data);    
        if(head == null)
        {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node curr = head;
        if(curr.data >= data)
        {
            newNode.next = curr;
            while(curr.next != head)
            {
                curr = curr.next;
            }
            curr.next = newNode;
            head = newNode;
            return head;
        }
        while(curr.next != head && curr.next.data <= data)
        {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
}
