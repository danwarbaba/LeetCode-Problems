class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = highestValue(piles);
        int answer=high;
        while(low<=high){
            int mid = low + (high-low)/2;
            long totalHourse=findTotalHourse(piles, mid);
            if(totalHourse<=h){
                answer = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return answer;
        
    }

    public static long findTotalHourse(int arr[], int div){
        long answer=0;
        for(int i: arr){
            answer+=(i + div - 1) / div;
        }
        return answer;
    }

    public static int highestValue(int arr[]){
        int max=0;
        for(int i: arr){
            max = Math.max(max, i);
        }
        return max;
    }
}