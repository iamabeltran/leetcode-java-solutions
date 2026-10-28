import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)return s.length();

        int max_size=0;
        HashSet longest_set= new HashSet<>();
        int lo=0;
        int hi=0;

        while (hi<s.length()) {
            if (!longest_set.contains(s.charAt(hi))) {
                longest_set.add(s.charAt(hi));
                if(hi+1<s.length()){
                    if(s.substring(lo, hi+1).length()>max_size) max_size=(s.substring(lo, hi+1).length());
                }else{
                    if(s.substring(lo).length()>max_size) max_size=(s.substring(lo).length());

                }
            }else{
                while(lo<hi){
                    if(s.charAt(lo+1)!=s.charAt(hi)){
                        lo++;
                        break;
                    }else lo++;
                }
            }
            hi++;

        }
        return max_size;

    }
    /*
    public boolean isEnglishLetter(char c){
        return (c>='A' && c<='Z') || (c>='a' && c<='z');
    }
    public boolean isAsciiDigit(char c){
        return (c>='0' && c<= '9');
    }
    */

}