class Solution {
    //the problem is very similar to fibonacci progression
    public int climbStairs(int n) {
        int previous_a=2;//for n-1
        int previous_b=1;//for n-2
        if(n==1) return previous_b;
        if(n==2) return previous_a;
        int current=0;// the current sumatory
        int calculus[]= new int[n+1];
        //for in case that n>=3
        for(int i=3; i<=n; i++){
            current=previous_a+previous_b;
            calculus[i]=current;
            previous_b=previous_a;
            previous_a=current;
        }
        
        return calculus[n];
    }
}

