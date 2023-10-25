class Solution {
    int value(char r) {
        if (r == 'I') return 1;
        if (r == 'V') return 5;
        if (r == 'X') return 10;
        if (r == 'L') return 50;
        if (r == 'C') return 100;
        if (r == 'D') return 500;
        if (r == 'M') return 1000;
        return -1;
    }
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int ans=0;
        int n = str.length();
        for(int i = 0;i < n;i++)
        {
            
            if((i+1)<n && value(str.charAt(i))<value(str.charAt(i+1)))
            {
                ans-=value(str.charAt(i));
            }
            else
            {
                ans+=value(str.charAt(i));
            }
        }
        return ans;
    }
    
}
