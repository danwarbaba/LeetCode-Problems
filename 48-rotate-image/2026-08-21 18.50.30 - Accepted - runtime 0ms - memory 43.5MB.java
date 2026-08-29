class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;

        for( int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(arr, i, j);
            }
        }

        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right]=temp;

                left++;
                right--;
            }

        }
    }

    public static void swap(int[][] arr, int i, int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
}