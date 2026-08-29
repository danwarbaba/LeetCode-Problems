class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m-=1;
        n-=1;
        int k;
        for(k=nums1.length-1;k>=0 && m>=0 && n>=0;k--){
            if(nums1[m] > nums2[n]){
                nums1[k] = nums1[m--];
            }else{
                nums1[k]=nums2[n--];
            }
        }
        while(k>=0 && n>=0){
            nums1[k--]=nums2[n--];
        }
        while(k>=0 && m>=0){
            nums1[k--]=nums1[m--];
        }
        
    }
}