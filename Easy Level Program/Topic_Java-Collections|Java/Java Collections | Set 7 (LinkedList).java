class GfG 
{
    public void deleteNode(Node node) {
        //Add your code here
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
    }
}
