class Solution {
    public int findMin(int[] nums) {
        return findMinEle(nums);
    }
    //3hourse of hardwork💁
    public static int findMinEle(int nums[]){
        int low =0;
        int high = nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid] >= nums[low] && nums[mid] <= nums[high]){
                return nums[low];
            }else if(nums[mid] >= nums[low] && nums[mid] >= nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }
}