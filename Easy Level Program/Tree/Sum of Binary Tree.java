class BinaryTree
{
    static int sumBT(Node head)
    {
        //Code
        if(head == null) return 0;
        return sumBT(head.left) + sumBT(head.right) + head.data;
    }
}
