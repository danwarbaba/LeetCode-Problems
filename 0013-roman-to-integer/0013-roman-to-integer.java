class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int v1 = returnvalues(s.charAt(i));
            if(i+1 < s.length()){
                int v2 = returnvalues(s.charAt(i+1));
                if(v1<v2){
                    sum-=v1;
                }else{
                    sum+=v1;
                }
            }else{
                sum+=v1;
            }

        }
        return sum;
    }
    public static int returnvalues(char c){
        switch(c){
            case 'I': return 1; 
            case 'V': return 5; 
            case 'X': return 10; 
            case 'L': return 50; 
            case 'C': return 100; 
            case 'D': return 500; 
            case 'M': return 1000; 
            default : return -1;
        }
    }
}