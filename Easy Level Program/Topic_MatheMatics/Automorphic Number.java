class Solution
{
    public String is_AutomorphicNumber(int n)
    {
        // Code here
        int a  = n*n;
        while(n!=0)
        {
            if(a%10!=n%10)
            {
                return "Not Automorphic";
            }
            a/=10;
            n/=10;
        }
        return "Automorphic";
    }
}
