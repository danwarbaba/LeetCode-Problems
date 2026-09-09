class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];

        List<List<Integer>> li = new ArrayList<>();
        int[][] res = new int[intervals.length][2];
        int count=0;

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] > end){
                res[count][0] =start;
                res[count++][1] = end; 
                start = intervals[i][0];
                end = intervals[i][1];
            }
            else if(intervals[i][0] <= end && intervals[i][1] > end){
                end = intervals[i][1];
            }
        }
        res[count][0] = start;
        res[count++][1] = end;

        return Arrays.copyOf(res, count);
    }
}