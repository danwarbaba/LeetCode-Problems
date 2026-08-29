class Solution {
    public int maxProduct(int n) {
        int max1=0;
        int max2=0;
        int res=1;
        while(n>0){
            res=n%10;
            if(res>max1){
                max2=max1;
                max1=res;
            }else if(res>=max2){
                max2=res;
            }

            n/=10;
        }
        return max1*max2;
        
    }
}