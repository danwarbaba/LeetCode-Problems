class Solution {
    public int reverse(int x) {
        long res=0;

        //-2147483648
        //2147483647

        while(x!=0){

            res+=x%10;
            res*=10;
            x/=10;
        }

        System.out.println(res <= Integer.MAX_VALUE && res>=Integer.MIN_VALUE);
        
        if(res <= Integer.MAX_VALUE && res>=Integer.MIN_VALUE){
            return (int)(res/10);
        }else
        return 0;
        
    }
}