class Solution {
    public int addDigits(int num) {
    int res=0;
    int fnl=0;
    int fnl1=0;
        while(num>0){
            res+=(num%10);
            num/=10;
        }
        while(res>0){
            fnl+=res%10;
            res/=10;
        }
        while(fnl>0){
            fnl1+=fnl%10;
            fnl/=10;
        }
        return fnl1;

    }
}