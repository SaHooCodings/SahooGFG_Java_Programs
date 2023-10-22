class Solution{
    
    // Function to delete middle element from a stack
    // Takes the size of the stack and the stack itself as input
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        int cnt = 0;
        Stack<Integer> temp = new Stack<>();
        
        // Find the middle index of the stack
        // Pop elements from the original stack and push them into a temporary stack until reaching the middle index
        while(cnt < n/2) {
            int x = st.pop();
            temp.push(x);
            cnt++;
        }
        
        // Pop the middle element from the original stack
        st.pop();
        
        // Push the remaining elements from the original stack into the temporary stack
        while(!st.empty()){
            int x = st.pop();
            temp.push(x);
        }
        
        // Create a new stack to store the final result
        Stack<Integer> res = new Stack<>();
        
        // Pop elements from the temporary stack and push them into the new stack to reverse the order
        while(!temp.empty()){
            int y = temp.pop();
            res.push(y);
        }
        
        // Return the final result stack
        return res;
    }
}
