class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> vals = new HashSet<>();
        Set<Integer> ans = new HashSet();

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                    if(i<=j){
                        vals.add(nums[i]^nums[j]);
                    }
            }
        }

        for(Integer i: vals){
            for(int j: nums){
                ans.add(i^j);
            }
        }
        return ans.size();
        
    }
}