class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        allPermuatations(nums, 0, resList);
        return resList;
    }
    public static void allPermuatations(int arr[], int fi, List<List<Integer>> res){
        if(fi == arr.length-1){
            List<Integer> li = new ArrayList<>();
            for(int i: arr){
                li.add(i);
            }
            res.add(li);
            return;
        }

        for(int i=fi; i<arr.length;i++){
            swap(i, arr, fi);
            allPermuatations(arr, fi+1, res);
            swap(i, arr, fi);
        }
    }

    public static void swap(int i, int arr[], int fi){
        int temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }
}