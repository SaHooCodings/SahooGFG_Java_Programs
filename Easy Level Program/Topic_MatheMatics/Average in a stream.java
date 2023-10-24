class Solution {
    float[] streamAvg(int[] arr, int n) {
        // code here
        float sum = 0;
        float div = 0;
        float[] f = new float[arr.length];
        for(int i = 0;i < arr.length;i++)
        {
            sum += arr[i];
            div = sum/(i+1);
            f[i] = div;
        }
        return f;
    }
}
