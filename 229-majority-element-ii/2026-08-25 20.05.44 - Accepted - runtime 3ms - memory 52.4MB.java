class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=0, ele2=0;
        int count1=0, count2=0;
        for(int i: nums){
            if(count1==0 && i!=ele2){
                count1=1;
                ele1=i;

            }else if(count2==0 && i!=ele1){
                count2=1;
                ele2=i;
            }else if(i==ele1){
                count1++;
            }else if(i==ele2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        int n=nums.length/3+1;

        List<Integer> li = new ArrayList<>();
        count1=0;
        count2=0;
        for(int i: nums){
            if(i==ele1){
                count1++;
            }else if(i==ele2){
                count2++;
            }
        }
        if(count1>=n)li.add(ele1);
        if(count2>=n)li.add(ele2);

        return li;
    }

}