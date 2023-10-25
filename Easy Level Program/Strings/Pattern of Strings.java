class Solution {
    ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String> l = new ArrayList<>();
        for(int i = S.length()-1;i >= 0;i--)
        {
            l.add(S.substring(0,i+1));
        }
        return l;
    }
};
