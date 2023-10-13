class Solution{
    static double switchCase(int choice, List<Double> arr)
    {
        // code here
        double res = 0.0;
        switch(choice)
        {
            case 1:
                double R = arr.get(0);
                double cir = Math.PI*R*R;
                res = cir;
                break;
            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                double rec = L*B;
                res = rec;
                break;
            default:
                System.out.print("error");
        }
        return res;
    }
}
