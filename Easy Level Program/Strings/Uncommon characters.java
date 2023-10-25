class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        int n = A.length();
        int m = B.length();
        HashSet<Character> set1 = new HashSet<>();
        for(int i = 0;i < n;i++)
        {
            set1.add(A.charAt(i));
        }
        HashSet<Character> set2 = new HashSet<>();
        for(int i = 0;i < m;i++)
        {
            set2.add(B.charAt(i));
        }
        for(char ch : set1)
        {
            if(!set2.contains(ch))
            {
                set2.add(ch);
            }
            else
            {
                set2.remove(ch);
            }
        }
        int arr[] = new int[26];
        for(char ch : set2)
        {
            arr[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == 1)
            {
                sb.append((char)(i+'a'));
            }
        }
        if(sb.length() == 0) sb.append(-1);
        return sb.toString();
    }
}
