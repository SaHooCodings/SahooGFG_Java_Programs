class Solution {
    static String javaSub(String S, int L, int R) {
        // code here
        String str = "";
        for(int i = L;i<=R;i++){
            str+=S.charAt(i);
        }
        return str;
    }
}
