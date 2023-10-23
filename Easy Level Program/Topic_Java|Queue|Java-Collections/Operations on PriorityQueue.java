class Geeks{
    
    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k){
        q.add(k);
    }
    
    //Function to check if k is in q
    static boolean find(PriorityQueue<Integer> q, int k){
        return q.contains(k);
    }
    
    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q){
        return q.poll();
    }
    
}
