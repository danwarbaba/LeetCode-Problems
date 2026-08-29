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
        System.out.println(res);

        if(res <= Integer.MAX_VALUE && res<=Integer.MIN_VALUE){
            return (int)(res/10);
        }
        return 0;
        
    }
}