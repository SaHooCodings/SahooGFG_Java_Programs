class Solution {
    static String armstrongNumber(int n){
        // code here
        int sum = 0;
        String str = String.valueOf(n);
        for(int i = 0;i<str.length();i++){
        int num = str.charAt(i)-'0';
        sum+=(num*num*num);
        }
        if(sum==n)
        return "Yes";
    return "No";
    }
}
