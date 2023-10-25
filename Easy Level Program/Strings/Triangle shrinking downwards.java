class Solution {
    static String triDownwards(String S){
        // code here
        // String s = "";
        // for(int i = 0;i < S.length();i++)
        // {
        //     for(int j = 0;j < S.length();j++)
        //     {
        //         if(i <= j)
        //         {
        //             s += S.charAt(j);
        //         }
        //         else
        //         {
        //             s += ".";
        //         }
        //     }
        // }
        // return s;
        StringBuilder s1 = new StringBuilder(S);
        StringBuilder s2 = new StringBuilder();
        s2.append(s1);
        for(int i = 0;i < S.length()-1;i++)
        {
            s2.append(s1.replace(i,i+1,"."));
        }
        return s2.toString();
    }
};
