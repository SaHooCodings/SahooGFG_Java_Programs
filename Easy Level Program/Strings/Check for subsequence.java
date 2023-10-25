class Solution{
    boolean isSubSequence(String A, String B){
        int i = 0, j = 0;
        while(i < A.length() && j < B.length())
        {
            if(A.charAt(i) == B.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return i == A.length();
    }
}
