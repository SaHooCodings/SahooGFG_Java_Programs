class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        //Add your code here.
        Node prev=null;
        Node curr=head;
        while(curr.next!=head){
            if(curr.data==d){
                prev.next=curr.next;
                return head;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        //Add your code here
         Node curr=head;
        Node ne=curr.next;
        Node temp=null;
        while(ne!=head){
            temp=ne.next;
            ne.next=curr;
            curr=ne;
            ne=temp;
            
        }
        ne.next=curr;
        head=curr;
        return head;
        
    }
}
