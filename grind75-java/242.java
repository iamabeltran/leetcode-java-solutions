import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> counter_s = new HashMap<>();
        HashMap<Character,Integer> counter_t = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (isLetter(c)==true) counter_s.merge(c, 1, Integer::sum);
        }
        for (Character c : t.toCharArray()) {
            if (isLetter(c)==true) counter_t.merge(c, 1, Integer::sum);
        }
        if (counter_s.equals(counter_t)) return true;

        return false;
    }
    boolean isLetter(Character c){
        if ((c>='A' && c>='Z')||(c>='a'&&c<='z')) {
            return true;
        }
        return false;
    }
}