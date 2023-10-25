class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int n = s.length();
       int m = x.length();
       for(int i = 0;i < n-m+1;i++)
       {
           if(s.charAt(i) == x.charAt(0))
           {
               if(s.substring(i,i+m).equals(x))
               {
                   return i;
               }
           }
       }
       return -1;
    }
}
