class Solution {
    public int search(int[] nums, int target) {
        int ans = findRotate(nums, target);
        return ans==-1?-1:ans;
    }

    public static int findRotate(int []arr, int target){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target <= arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(target <= arr[high] && target >= arr[mid]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}