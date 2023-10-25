class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node newNode = new Node(data);
        int ctr = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            ctr++;
        }
        int x = (ctr%2 == 0)?(ctr/2):((ctr+1)/2);
        temp = head;
        for(int i = 1;i < x;i++)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
