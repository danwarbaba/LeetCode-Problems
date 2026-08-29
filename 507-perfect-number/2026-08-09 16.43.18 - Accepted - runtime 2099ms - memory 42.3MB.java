class Solution {
    public boolean checkPerfectNumber(int num) {
        int res=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                res+=i;
            }
        }
        if(num==res){
            return true;
        }
        return false;
        
    }
}