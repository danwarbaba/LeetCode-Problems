class Solution {
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        solve(0, nums, res);
        return res;
    }

    void solve(int s, int[] arr, List<List<Integer>> res){
        if(s == arr.length - 1){
            ArrayList<Integer> newAr = new ArrayList<>();
            for(int val: arr){
                newAr.add(val);
            }
            res.add(newAr);
            return;
        }
        for (int i = s; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = s; j < i; j++) {
                if (arr[j] == arr[i]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                continue;
            }
            swap(i, arr, s);
            solve(s + 1, arr, res);
            swap(i, arr, s);
        }
    }
    public static void swap(int i, int arr[], int fi){
        int temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }
}