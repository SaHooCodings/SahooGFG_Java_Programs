class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        ArrayList<Integer> ar  = new ArrayList<>();
       Node curr = head;
       while(curr!=null){
           ar.add(curr.data);
           curr = curr.next;
       }
       Collections.sort(ar);
       curr = head;
       for(int i = 0; i<ar.size()&&curr!=null; i++){
        curr.data = ar.get(i);
        curr = curr.next;
       }
       //System.out.println(ar);
       return head;
   }


}
