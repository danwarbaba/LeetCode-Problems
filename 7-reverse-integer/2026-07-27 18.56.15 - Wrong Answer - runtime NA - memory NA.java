class Solution {
    public int reverse(int x) {
        boolean bool=true;
        long res=0;

        //-2147483648
        //2147483647

        while(x!=0){

            res+=x%10;
            res*=10;
            x/=10;
        }
        System.out.println((int)(res/10));

        if(res <= Integer.MAX_VALUE && res>=Integer.MIN_VALUE){
            return (int)(res/10);
        }else
        return 0;
        
    }
}