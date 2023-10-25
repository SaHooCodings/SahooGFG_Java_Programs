/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
         if(k==0 || head==null){
          return head;
      }
      Node tail=head;
      //we have to find tail of list to rotate and connect
      while(tail.next!=null){
          tail=tail.next;
      }
      Node temp=head;
      int  count=1;
      while(count<k){
          temp=temp.next;
          count++;
      }
      tail.next=head;
      head=temp.next;
      temp.next=null;
        
       return head;

    }
}
