class Solution {
    public int longestPalindrome(String s) {
        int alphabet[] = new int[52];
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if((c>='a' && c<='z')){
                alphabet[26+ (c-'a')]++;
            }
            if(c>='A' && c<='Z'){
                alphabet[c-'A']++;
            }
        }
        int max_odd=-1; //position of the max_odd
        int pos_max_odd = -1;
        int odds_sum=0;
        for (int i=0; i<alphabet.length;i++) {
            int c=alphabet[i];
            if(c%2!=0 && c>=max_odd){
                    max_odd=c; 
                    pos_max_odd=i;

            }            
        }

        for (int i=0; i<alphabet.length;i++) {
            int c=alphabet[i];
            if(c%2!=0 && i!=pos_max_odd){
                odds_sum+=(c-1);
            }            
        }


        if(max_odd==-1)max_odd=0;
        int result=0;
        for (int i = 0; i < alphabet.length; i++) {
            int c=alphabet[i];
            if(c%2==0)result+=c;
        }
        return result+max_odd+odds_sum;

    }
}