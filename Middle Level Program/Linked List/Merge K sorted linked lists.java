class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        ArrayList<Integer> l = new ArrayList<>();
            int i=0;
            Node p=arr[i];
            while(p!=null){
                if(p.next == null && i < arr.length-1){
                    p.next=arr[i+1];
                    i++;
                }
                l.add(p.data);
                p=p.next;
            }
            Collections.sort(l);
            p=arr[0];
            for(int j=0;j<l.size();j++){
                p.data=l.get(j);
                p=p.next;
            }
            return arr[0];
    }
}
