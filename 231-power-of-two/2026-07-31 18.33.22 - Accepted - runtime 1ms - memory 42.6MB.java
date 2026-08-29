class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean bool = powerOfTwo(n);
        if(bool){return true;}

        return false;
        
    }
    public static boolean powerOfTwo(int n){
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }

        return powerOfTwo(n/2);
    }
}