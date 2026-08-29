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


        if(res <= 2147483648 && res>=-2147483649){
            return (int)(res/10);
        }
        return 0;
        
    }
}