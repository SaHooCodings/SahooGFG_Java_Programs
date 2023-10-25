/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        Node temp1=reverse(head);
        Node temp=temp1;
        if(temp.data<9){
            temp.data=temp.data+1;
        }
        else{
            while(temp.next!=null && temp.data==9){
                temp.data=0;
                temp=temp.next;
            }
            if(temp.data==9){
                temp.data=0;
                Node newNode=new Node(1);
                temp.next=newNode;
            }
            else{
                temp.data=temp.data+1;
            }
        }
        return reverse(temp1);
    }
    static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node dummy=head.next;
        Node rev=reverse(head.next);
        head.next=null;
        dummy.next=head;
        return rev;
    } 
}
