class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> li=new LinkedList<>();
        List<Integer> res=new ArrayList();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(li.contains(s.charAt(i))){
                li.clear();
                res.add(max);
                max=0;
            }else{
                li.add(s.charAt(i));
                max++;
            }
        }

        for(Integer i: res){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}