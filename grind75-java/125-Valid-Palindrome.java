class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while (left<right) {
            //we increase the left pointer in case that is not a digit or a number
            while (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                if (left>right) return true;//we supose that the string is full of not digits or letters
            }
            //we increase the right pointer in case that is not a digit or a number
            while (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                if (left>right) return true;//we supose that the string is full of not digits or letters
            }
            //now in theory we have the 'mirror comparation' we use lower or upper case to compare both characters
            if (Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;            
        }
        return true;
    }   
}