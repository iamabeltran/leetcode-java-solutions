class Solution {
    public int myAtoi(String s) {
        String aux;
        boolean isnegative=false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ')continue;
            if((s.charAt(i)=='-')&&aux.length()==0){
                negative=true;
            }else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                aux+=s.charAt(i);
            }else break;
        }
        int result=0;
        for (int i = aux.length()-1; i >= 0; i--) {
            result+= (aux.charAt(i)-'0')*potence(10, Math.abs(i-aux.length()-1));
            System.out.println("resultado: "+result);
        }
        return isnegative ? result*(-1) : result;
    }
    public int potence(int base, int exponent){
        if(exponent==0) return 1;
        return base*exponent;
    }

    

}
