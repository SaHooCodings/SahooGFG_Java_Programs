class GfG
{
    public static int moduarNode(Node head, int k)
    {
        // add your code here
        int i = 1;
        Node modular = null;
        for(Node curr = head;curr != null;curr = curr.next)
        {
            if(i % k == 0)
            {
                modular = curr;
            }
            i++;
        }
        if(modular == null) return -1;
        return modular.data;
    }
}
