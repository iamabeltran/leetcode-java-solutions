class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==1 && nums[0]>=target)return 0;
        if(nums.length==1 && nums[0]<target)return 1;
        int lo=0;
        int hi=nums.length-1;
        int closest_difference=Integer.MAX_VALUE;
        int closest_position=-1;
        int mid=0;
        while (lo<=hi) {
            mid = lo + (hi-lo)/2;
            if(Math.abs(nums[mid]-target)<closest_difference){
              closest_difference=Math.abs(nums[mid] -target);
              closest_position=mid;  
            }
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) lo=mid+1;
            if(nums[mid]>target) hi=mid-1;
        }
        if(target>nums[closest_position])return closest_position+1;
        else return closest_position;
    }
}