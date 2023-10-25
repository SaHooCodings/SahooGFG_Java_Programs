class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       int i = 1;
       Node curr = node;
       while(i < ind)
       {
           curr = curr.next;
           i++;
       }
       return curr.data;
    }
}
