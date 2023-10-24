class Solution {
    boolean fascinating(long n) {
        // code here
        String s1 = Long.toString(n);
        String s2 = Long.toString(n*2);
        String s3 = Long.toString(n*3);
        String s = s1+s2+s3;
        int[] set = new int[10];
        for(int i = 0;i < s.length();i++)
        {
            set[s.charAt(i) - '0']++;
        }
        for(int i = 1;i < set.length;i++)
        {
            if(set[i]!=1)
            return false;
        }
        return true;
    }
}
