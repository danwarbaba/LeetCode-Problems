class Solution {
    public int findNumbers(int[] nums) {
        int countEven=0;
        for(int i: nums){
            if(evenDigits(i)){
                countEven++;
            }

        }

        return countEven;
    }

    public boolean evenDigits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        if(count%2==0)
        {
            return true;
        }
        return false;
    }



}