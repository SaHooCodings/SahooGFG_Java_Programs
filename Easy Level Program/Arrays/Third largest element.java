class Solution {
    int thirdLargest(int a[], int n) {
        if (n <= 2)
			return -1;
		int big1 = Math.max(a[0], a[1]);
		int big2 = Math.min(a[0], a[1]);
		int big3 = Integer.MIN_VALUE;

		for (int i = 2; i < n; i++) {
			// three way filtering
			if (a[(int) i] > big3) {
				big3 = a[(int) i];
			}
			if (a[(int) i] > big2) {
				big3 = big2;
				big2 = a[(int) i];
			}
			if (a[(int) i] > big1) {
				big2 = big1;
				big1 = a[(int) i];
			}
		}
		return big3;
	}
}
