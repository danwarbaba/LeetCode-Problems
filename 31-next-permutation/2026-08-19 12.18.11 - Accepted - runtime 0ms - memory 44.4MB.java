class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }

        if(idx==-1){
            reverseArray(nums, 0);
            return;
        }

         for (int i = nums.length - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(i, idx, nums);
                break;
            }
        }

        reverseArray(nums, idx+1);
    }
    public static void swap(int i, int j, int []arr){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }


    public static int[] reverseArray(int arr[], int start){
        int i=start;
        int j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}