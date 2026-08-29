class Solution {
    public int reverse(int x) {
        boolean bool=true;
        int res=0;

        if(x>Integer.MAX_VALUE){
            return 0;
        }
        
        while(x!=0){
            if(x%10==0 && bool==true){
                bool = false;
            }
            bool=false;

            res+=x%10;
            res*=10;
            x/=10;
        }
        return res/10;
    }
}