class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        if(s1.equals("0") || s2.equals("0")) return "0";
        int n = s1.length();
        int m = s2.length();
        boolean minus = false;
        if(s1.charAt(0) == '-' && s2.charAt(0) == '-')
        {
            s1 = s1.substring(1);
            n--;
            s2 = s2.substring(1);
            m--;
        }
        else if(s1.charAt(0) == '-')
        {
            s1 = s1.substring(1);
            n--;
            minus = true;
        }
        else if(s2.charAt(0) == '-')
        {
            s2 = s2.substring(1);
            m--;
            minus = true;
        }
        int len = n+m;
        int nm[] = new int[len];
        for(int i = 0;i < m;i++)
        {
            int x = s2.charAt(m-1-i) - '0';
            int carry = 0;
            for(int j = 0;j < n;j++)
            {
                int y = s1.charAt(n-1-j) - '0';
                int temp = x*y+carry+nm[len-1-i-j];
                nm[len-1-i-j] = temp%10;
                carry = temp / 10;
            }
            if(carry!=0)
            {
                nm[len-1-i-n] = carry;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(minus)
        {
            sb.append('-');
        }
        int zeros = 0;
        while(zeros < len && nm[zeros]==0)
        {
            zeros++;
        }
        for(int i = zeros;i < len;i++)
        {
            sb.append((char)(nm[i]+'0'));
        }
        return sb.toString();
    }
}
