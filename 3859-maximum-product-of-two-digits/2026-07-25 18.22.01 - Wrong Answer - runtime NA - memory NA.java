class Solution {
    public int maxProduct(int n) {
        int res=1;
        int count=0;
        while(n>0 && count<=1){
            res*=n%10;
            n/=10;
            count++;

        }
        return res;
        
    }
}