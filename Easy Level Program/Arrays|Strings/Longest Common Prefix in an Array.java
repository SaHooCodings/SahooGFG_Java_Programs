class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String res = "";
        boolean include;
        for(int i = 0;i < arr[0].length();i++)
        {
            include = true;
            for(int j = 1;j < n;j++)
            {
                if(i>=arr[j].length()||arr[0].charAt(i)!=arr[j].charAt(i))
                {
                    include = false;
                    break;
                }
            }
            if(!include) break;
            res+=arr[0].charAt(i);
        }
        if(res=="") return "-1";
        return res;
    }
}
