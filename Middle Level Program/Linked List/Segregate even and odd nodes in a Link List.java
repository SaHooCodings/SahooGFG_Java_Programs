class Solution{
    Node divide(int N, Node head){
        // code here
        Node even =new Node (0);
        Node evenhead=even;
        Node odd=new Node(0);
        Node oddhead=odd;
        Node curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                even.next=curr;
                even=even.next;
            }
            else{
                odd.next=curr;
                odd=odd.next;
            }
            curr=curr.next;
        }
        even.next=oddhead.next;
        odd.next=null;
        
        return evenhead.next;
    }
}
