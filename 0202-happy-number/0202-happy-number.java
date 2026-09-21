class Solution {
    public boolean isHappy(int n) {
        int slow = calculateHappyNumber(n);
        int fast = calculateHappyNumber(calculateHappyNumber(n));
        while(slow!=fast){
            slow = calculateHappyNumber(slow);
            fast= calculateHappyNumber(calculateHappyNumber(fast));
        }
        return slow==1;
    }
    public static int calculateHappyNumber(int n){
        int sum=0;
        while(n!=0){
            int digit = n%10;
            sum+=Math.pow(digit, 2);
            n/=10;
        }
        return sum;
    }
}