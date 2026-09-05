class Solution {
    public boolean isPerfectSquare(int num) {
        long x=num;
        while (true){
            long next =(x +num / x) / 2;
            if (next >= x){
                break;
            }
            x=next;
        }
        return x*x==num;
    }
}