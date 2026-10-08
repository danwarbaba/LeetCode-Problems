class Solution {
    public int[] searchRange(int[] arr, int target) {
        return new int[]{firstOccurrence(arr, target), secondOccurence(arr, target)+1};
    }
    public static int firstOccurrence(int arr[], int tar){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==tar){
                ans=mid;
                high=mid-1;
            }else if(tar>arr[mid]){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static int secondOccurence(int arr[], int tar){
                int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==tar){
                ans=mid;
                low=mid+1;
            }else if(tar>arr[mid]){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans-1;
    }
}