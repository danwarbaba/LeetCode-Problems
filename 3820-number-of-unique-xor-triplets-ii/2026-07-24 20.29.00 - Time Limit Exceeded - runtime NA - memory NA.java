class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> vals = new HashSet<>();

        for(int i=0;i<nums.length;i++)
            for(int j=0;j<nums.length;j++)
                for(int k=0;k<nums.length;k++){
                    if(i<=j && j<=k){
                        vals.add(nums[i]^nums[j]^nums[k]);
                    }
                }

        return vals.size();
        
    }
}