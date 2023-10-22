public class QueueClass
{
    Queue<Integer>q;
    QueueClass(){
        q=new LinkedList<>();
    }
    public void addElement(int key)
    {
        //Add your code here.
        q.add(key);
    }
    public void RemoveElement()
    {
        //Add your code here.
        if(q.size()!=0){
            int rem = q.remove();
            System.out.print(rem+" ");
        }
        else{
            System.out.print("-1 ");
        }
    }
    public void peekElement()
    {
        //Add your code here.
        if(q.size()!=0){
            int ad = q.peek();
            System.out.print(ad+" ");
        }
        else{
            System.out.print("-1 ");
        }
        
    }
    public void Size()
    {
        //Add your code here.
        System.out.print(q.size()+" ");
    }
}
