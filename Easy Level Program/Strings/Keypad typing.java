public static String printNumber(String s, int n) 
{
    //Your code here
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i < n;i++)
    {
        if(s.charAt(i) == 'a' || s.charAt(i) == 'b' || s.charAt(i) == 'c')
        {
            sb.append('2');
        }
        if(s.charAt(i) == 'd' || s.charAt(i) == 'e' || s.charAt(i) == 'f')
        {
            sb.append('3');
        }
        if(s.charAt(i) == 'g' || s.charAt(i) == 'h' || s.charAt(i) == 'i')
        {
            sb.append('4');
        }
        if(s.charAt(i) == 'j' || s.charAt(i) == 'k' || s.charAt(i) == 'l')
        {
            sb.append('5');
        }
        if(s.charAt(i) == 'm' || s.charAt(i) == 'n' || s.charAt(i) == 'o')
        {
            sb.append('6');
        }
        if(s.charAt(i) == 'p' || s.charAt(i) == 'q' || s.charAt(i) == 'r' || s.charAt(i) == 's')
        {
            sb.append('7');
        }
        if(s.charAt(i) == 't' || s.charAt(i) == 'u' || s.charAt(i) == 'v')
        {
            sb.append('8');
        }
        if(s.charAt(i) == 'w' || s.charAt(i) == 'x' || s.charAt(i) == 'y' || s.charAt(i) == 'z')
        {
            sb.append('9');
        }
    }
    return sb.toString();
}
