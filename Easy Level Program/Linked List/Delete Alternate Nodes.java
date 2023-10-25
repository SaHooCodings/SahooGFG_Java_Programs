class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow.next = fast.next.next;
            slow = slow.next;
            fast = fast.next;
        }
    }
}
