class GfG
{
    public static Node sortedInsert(Node head, int x)
    {
        // add your code here
        Node temp=new Node(x);
        if(head==null)
        return head;
        if(head.next==null || x==head.data)
        {
            head.next=temp;
            temp.prev=head;
            head.prev=null;
            return head;
        }
        if(x<head.data)
        {
            temp.next=head;
            head.prev=temp;
            temp.prev=null;
            return temp;
        }
        Node curr=head;
        while(curr!=null)
        {
            if(curr.data<x && curr.next==null)
            {
                curr.next=temp;
                temp.prev=curr;
                return head;
            }
            else
            {
                curr=curr.next;
            }
        }
        curr=head;
        while(curr.next!=null && curr.next.data<x)
        {
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next.prev=temp;
        temp.prev=curr;
        curr.next=temp;
        return head;
    }
}
