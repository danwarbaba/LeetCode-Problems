class Solution {
    public int reverse(int x) {
        boolean bool=true;
        long y=x;
        long res=0;

        while(y!=0){

            res+=y%10;
            res*=10;
            y/=10;
        }

        int a=(int)res;

        if(a > Integer.MAX_VALUE && a<Integer.MIN_VALUE){
            return 0;
        }
        return (int)(res/10);
        
    }
}