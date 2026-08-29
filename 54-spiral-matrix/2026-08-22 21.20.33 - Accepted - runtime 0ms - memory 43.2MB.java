class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length;
        int m=arr[0].length;
        int left=0, right=m-1;
        int top=0, bottom=n-1;
        List<Integer> li = new ArrayList<>();

        while(top<=bottom && left <= right){
            for(int i=left;i<=right;i++){
                li.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                li.add(arr[i][right]);
            }
            right--;
            if(top<=bottom)
            for(int i=right;i>=left;i--){
                li.add(arr[bottom][i]);
            }
            bottom--;
            if(left<=right)
            for(int i=bottom;i>=top;i--){
                li.add(arr[i][left]);
            }
            left++;
        }
        return li;
    }
}