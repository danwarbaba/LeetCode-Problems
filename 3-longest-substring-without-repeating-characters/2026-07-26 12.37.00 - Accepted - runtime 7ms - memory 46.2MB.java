class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int max=0;
        int left=0;
        for(int right=0;right<s.length();right++){

            while(window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left++;
            }

            window.add(s.charAt(right));
            max=Math.max(max, right-left+1);
        }
        return max;
    }
}