class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        Map<Character, Integer> frequency = new TreeMap<>();
        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(frequency.containsKey(s.charAt(i))){
                int val = frequency.get(s.charAt(i));
                frequency.put(s.charAt(i), ++val);

            }else{
                frequency.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> entry:frequency.entrySet()) {
            if(entry.getValue()%2==0){
                left.append(returnSubString(entry.getKey(), entry.getValue()/2));
            }else{
                left.append(returnSubString(entry.getKey(), entry.getValue()/2));
                middle.append(entry.getKey());
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();
        return (left.toString()+middle.toString()+right.toString());

    }

    public static String returnSubString(char s, int count){
        String str="";
        for(int i=0;i<count;i++){
            str+=s;
        }
        return str;
    }
}