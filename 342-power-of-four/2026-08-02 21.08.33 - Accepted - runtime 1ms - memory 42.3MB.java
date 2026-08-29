class Solution {
    public boolean isPowerOfFour(int n) {
    
        if(powerOfFour(n)){return true;}

        return false;
        
    }
    public static boolean powerOfFour(int n){
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4!=0){
            return false;
        }

        return powerOfFour(n/4);
    }
}