class Solution {
    public int[] runningSum(int[] nums) {
        int val=0;
        for(int i=0;i<nums.length;i++){
            val+=nums[i];
            nums[i]=val;
        }
        return nums;
    }
}