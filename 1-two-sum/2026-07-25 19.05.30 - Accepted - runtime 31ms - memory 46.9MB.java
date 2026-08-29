class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=1;
        for(i=0;i<nums.length;i++){
            j=findVal(i, target, nums);
            if(j!=0){
                return new int[]{i,j};
            }
        }
        return null; 
    }
    public static int findVal(int i, int target, int nums[]){
        for(int j=i+1; j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return j;
            }
        }
        return 0;
    }
}