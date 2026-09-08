class Solution {
    public int countCommas(int n) {
        long count= 0;
        for (long start =1000,commas = 1; start <= n; start *= 1000, commas++) {
            long end = Math.min((start * 1000) - 1, (long) n);

            count += (end - start + 1) * commas;
        }
        return (int)count;
    }
}