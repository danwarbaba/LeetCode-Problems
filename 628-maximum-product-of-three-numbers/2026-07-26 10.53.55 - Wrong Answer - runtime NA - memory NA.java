class Solution {
    public int maximumProduct(int[] nums) {
        int max=1;
        int j=0;
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<=nums.length-3;i++)
        {
            j=i;
            while(j<i+3){
                max*=nums[j];
                j++;
            }
            li.add(max);
            if(j<=nums.length-1){
                max=1;
            }
        }
        for(Integer i: li){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}