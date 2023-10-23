class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        int cnt = 0;
        Stack<Integer> temp = new Stack<>();
        while(cnt < n/2) {
            int x = st.pop();
            temp.push(x);
            cnt++;
        }
        st.pop();
        while(!st.empty()){
            int x = st.pop();
            temp.push(x);
        }
        Stack<Integer> res = new Stack<>();
        while(!temp.empty()){
            int y = temp.pop();
            res.push(y);
        }
        return res;
    }
}
