class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;
        String sb="";

        while (i >= 0 || j >= 0 || carry != 0) {

            int digit1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;

            sb=(sum % 2)+sb;

            carry = sum / 2;

            i--;
            j--;
        }

        return sb;
        
    }
}