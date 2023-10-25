class Solution{
    public String removeConsecutiveCharacter(String S){
        String s = "";
        s+=S.charAt(0);
        int i = 1;
        while(i<S.length())
        {
            if(S.charAt(i) != S.charAt(i-1))
            {
                s+=S.charAt(i);
            }
            i++;
        }
        return s;
    }
}
