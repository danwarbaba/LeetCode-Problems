class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] str = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            str[i]=new StringBuilder();
        }
        boolean down=true;
        int index=0;
        for(int i=0;i<s.length();i++){
            str[inedx].append(s.charAt(i));
            if(bool){
                index++
            }else{
                index--;
            }
            if(index==0){
                bool=true;
            }else if(index ==numRows-1){
                bool=false;

            }

        }

        String st;
        for(StringBuilder i: str){
            st+=i;
        }

        return st;
        
    }
}