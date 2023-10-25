class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       int count =0;
       Node curr = head;
       while(head!=null){
           head = head.next;
           count++;
       }
       int ans=0;
       if(count%k==0){
           ans=count/k;
       }else{
           ans=(count/k)+1;
       }
       for(int i =1;i<ans;i++){
           curr = curr.next;
       }
        return curr.data;
    }
}
