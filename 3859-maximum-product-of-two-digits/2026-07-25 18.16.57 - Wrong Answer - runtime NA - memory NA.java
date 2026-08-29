class Solution {
    public int maxProduct(int n) {
        int res=1;
        while(n>0){
            res*=n%10;
            n/=10;
        }
        return res;
        
    }
}