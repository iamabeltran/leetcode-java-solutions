import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int majorityElement(int[] nums) {
        int result = nums[0];
        //int result=Integer.MAX_VALUE;
        
        HashMap<Integer,Integer> number_frecuency= new HashMap<>();
        HashMap<Integer,HashSet<Integer>> frecuencies_numbers= new HashMap<>();
        for (int i : nums) {
            number_frecuency.merge(i, 1, Integer::sum); 
            if (number_frecuency.get(i)>number_frecuency.get(result)) result=i;
        }
        return result;
    }
}