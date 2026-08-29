class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        int start=0, end=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && j>=i){
                    int leng = checkPalin(s.substring(i, j+1));
                    if(leng > max){
                        max=leng;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }

    public static int checkPalin(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }
        return i+j;
    }
}