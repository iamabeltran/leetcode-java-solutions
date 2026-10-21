import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> counter = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (isLetter(c)==true) counter.merge(c, 1, Integer::sum);
        }
        for (Character c : t.toCharArray()) {
            if (isLetter(c)==true) counter.merge(c, 1, Integer::sum);
        }
        for(Map.Entry<Character,Integer> entry: counter.entrySet()){
            if (entry.) {
                
            }
        }

        return false;
    }
    boolean isLetter(Character c){
        if ((c>='A' && c>='Z')||(c>='a'&&c<='z')) {
            return true;
        }
        return false;
    }
}