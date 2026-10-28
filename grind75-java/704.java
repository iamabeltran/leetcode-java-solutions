class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target)return 0;
        if(nums.length==1 && nums[0]!=target)return -1;
        int lo=0;
        int hi=nums.length-1;
        //int mid= lo +(hi-lo)/2;
        //if(nums[mid]==target)return mid;
        int mid=0;
        while (lo<=hi) {
//            if(nums[lo]==target)return lo;
            //if(nums[hi]==target)return hi;
            mid= lo +(hi-lo)/2; 
            System.out.println("mid: "+nums[mid]);
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) hi=mid-1;
            if(nums[mid]<target) lo=mid+1;
            
        }
        return -1;
    }
}