class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head.next == null) return head;
        
        Node mid = midNode(head);
        Node newHead = mid.next;
        mid.next = null;
        
        Node left = mergeSort(head);
        Node right = mergeSort(newHead);
        
        Node shead = merge(left, right);
        
        return shead;
    }
    static Node merge(Node left, Node right) {
        Node mhead = new Node(-1);
        Node temp = mhead;
        Node leftTemp = left;
        Node rightTemp = right;
        
        while(leftTemp != null && rightTemp != null) {
            int lData = leftTemp.data;
            int rData = rightTemp.data;
            
            if(lData <= rData) {
                temp.next = leftTemp;
                leftTemp = leftTemp.next;
            } else {
                temp.next = rightTemp;
                rightTemp = rightTemp.next;
            }
            temp = temp.next;
        }
        
        if(leftTemp != null) {
            temp.next = leftTemp;
        }
        
        if(rightTemp != null) {
            temp.next = rightTemp;
        }
        
        return mhead.next;
    }
    static Node midNode(Node head) {
        Node f = head;
        Node s = head;
        
        while(f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        
        return s;
    }
}
