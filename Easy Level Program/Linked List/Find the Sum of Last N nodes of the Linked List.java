class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      Node curr = head;
      int sum = 0;
      int ctr = 0;
      while(curr != null)
      {
          sum += curr.data;
          ctr++;
          curr = curr.next;
      }
      int x = ctr - k;
      int i = 0;
      curr = head;
      while(i < x)
      {
          sum -= curr.data;
          curr = curr.next;
          i++;
      }
      return sum;
    }
}
