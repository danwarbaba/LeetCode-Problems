class Solution {
    public int majorityElement(int[] nums) {
        int ele=0;
        int count=0;

        for(int i: nums){
            if(count==0){
                ele=i;
                count=1;
            }else if(i == ele){
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }
}