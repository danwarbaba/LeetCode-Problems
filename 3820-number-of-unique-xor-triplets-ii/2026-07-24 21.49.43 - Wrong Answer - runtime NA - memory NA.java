class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> vals = new HashSet<>();
        int k=0;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                    if(i<=j && j<=k){
                        vals.add(nums[i]^nums[j]^nums[k]);
                    }
            }
            k++;
        }
        return vals.size();
        
    }
}