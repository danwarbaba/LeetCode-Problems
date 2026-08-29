class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int n1=(nums[0]-1)*(nums[1]-1);

        int n2 = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);

        if(n1>n2) return n1;

        return n2;
        
    }
}