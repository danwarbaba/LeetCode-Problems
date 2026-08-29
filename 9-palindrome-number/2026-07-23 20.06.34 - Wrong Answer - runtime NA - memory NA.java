class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int res=0;
        while(a>0){
            res+=(a%10);
            res*=10;
            a=a/10;
        }

    if(x==(res/10)){
        return true;
    }else{
        return false;
    }
        
    }
}