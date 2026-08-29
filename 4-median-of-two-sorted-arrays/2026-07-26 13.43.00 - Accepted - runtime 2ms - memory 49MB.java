class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] median = new int[(nums1.length+nums2.length)];
        int i=0,j=0,k=0;

        while(i< nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                median[k++] = nums1[i++];
            }else{
                median[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            median[k++] = nums1[i++];
        }
        while(j<nums2.length){
            median[k++] = nums2[j++];
        }
        int n = median.length;
        double ret =2.0;

        if(n%2!=0){
            int ans = median[n/2];
            return ans;
        }else{
            int ans = median[n/2]+median[(n/2)-1];
            return ans/ret;
        }
    }
}