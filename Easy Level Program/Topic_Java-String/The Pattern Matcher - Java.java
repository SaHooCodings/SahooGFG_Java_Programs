class Geeks{
    
    static void follPatt(String s)
    {
        
        //Your code here
        int crt = 0;
        boolean flag = true;
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == 'x')
            {
                if(flag && crt != 0)
                {
                    break;
                }
                else
                {
                    flag = false;
                    crt++;
                }
            }
            else
            {
                flag = true;
                crt--;
            }
        }
        if(crt != 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(1);
        }
    }
}
