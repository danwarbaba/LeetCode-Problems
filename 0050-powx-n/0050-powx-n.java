class Solution {
    public double myPow(double x, int n) {
        long pow = Math.abs((long)n);
        double res = power(x, pow);
        if(n<0)return 1/res;

        return res;
    }
    public static double power(double x, long n) {
    double res=1;
    while (n > 0) {
        if (n%2 == 1) {
            res*= x;
        }

        x *=x;
        n/=2;
    }

    return res;
}
}