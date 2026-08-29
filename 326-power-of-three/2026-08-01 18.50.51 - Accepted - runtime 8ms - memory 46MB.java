class Solution {
    public boolean isPowerOfThree(int n) {
    boolean bool = powerOfThree(n);
        if(bool){return true;}

        return false;
        
    }
    public static boolean powerOfThree(int n){
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3!=0){
            return false;
        }

        return powerOfThree(n/3);
    }
}