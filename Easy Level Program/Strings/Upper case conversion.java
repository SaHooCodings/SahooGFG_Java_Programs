class Solution
{
    public String transform(String s)
    {
        // code here
        String str = "";
        String str1[] = s.split("\\s");
        for(String str2 : str1)
        {
            String ch1 = str2.substring(0,1);
            String ch2 = str2.substring(1,str2.length());
            str += ch1.toUpperCase()+ch2+" ";
        }
        return str;
    }
}
