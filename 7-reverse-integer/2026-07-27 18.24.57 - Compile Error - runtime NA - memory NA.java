class Solution {
    public int reverse(int x) {
        boolean bool=true;
        long res=0;

        if(x>Integer.MAX_VALUE && x<Integer.MIN_VALUE){
            return 0;
        }

        while(x!=0){

            res+=x%10;
            res*=10;
            x/=10;
        }

        if(res>Integer.MAX_VALUE && res<Integer.MIN_VALUE){
            return 0;
        }
        return r(long)es/10;
    }
}