class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        ArrayList<String> l = new ArrayList<>();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        for(int i = 0;i < S.length();i++)
        {
            if(S.charAt(i)>='A' && S.charAt(i)<='Z' || S.charAt(i)>='a' && S.charAt(i)<='z')
            {
                s1+=S.charAt(i);
            }
            else if(S.charAt(i)>='0' && S.charAt(i)<='9')
            {
                s2+=S.charAt(i);
            }
            else
            {
                s3+=S.charAt(i);
            }
        }
        l.add(s1);
        l.add(s2);
        l.add(s3);
        return l;
    }
} 
