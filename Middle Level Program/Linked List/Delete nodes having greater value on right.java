class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node curr = rev(head);
       head = curr;
       while(curr!=null && curr.next!=null){
           while(curr.next!=null &&curr.next.data<curr.data){
               curr.next = curr.next.next;
           }
           curr = curr.next;
       }
        return rev(head);
    }
    Node rev(Node head){
        if(head.next==null)return head;
        Node prev = null;
        Node next = null;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            
        }
        return prev;
    }
}
