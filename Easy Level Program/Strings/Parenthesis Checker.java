class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean cmp(char b, char c)
    {
        if(b=='{'&&c=='}')
        {
            return true;
        }
        else if(b=='('&&c==')')
        {
            return true;
        }
        else if(b=='['&&c==']')
        {
            return true;
        }
        return false;
    }
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s = new Stack<>();
        for(int i = 0;i < x.length();i++)
        {
            if(x.charAt(i)=='{'||x.charAt(i)=='['||x.charAt(i)=='(')
            {
                s.push(x.charAt(i));
            }
            else if(x.charAt(i)=='}'||x.charAt(i)==')'||x.charAt(i)==']')
            {
                if(s.isEmpty()==true||!cmp(s.peek(),x.charAt(i)))
                {
                    return false;
                }
                else
                {
                    s.pop();
                }
            }
        }
        if(s.isEmpty()==true)
        {
            return true;
        }
        return false;
    }
}
