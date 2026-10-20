class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1 && nums[0] == k) return 1;
        int result = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (i == 1 && nums[i] == k) {
                result++;
            } else if(i>=2){
                for (int j = 0; j <= nums.length-i; j++) {
                    int sum = 0;
                    for (int j2 = j; j2 <= j + (i-1) ; j2++) {
                        sum += nums[j2];
                        if (j2 == j + (i-1) && sum == k)result++;
                    }
                }
            }
        }
        return result;
    }
}

/*
 * basicamente tenemos que buscar en el peor de los casos sub arreglos de tamaño
 * n,n-1,n-2,... hasta llegar a arreglos de tamaño 1
 * sumar todos sus elementos y verificar que su suma de k, en caso de que si
 * aumentamos la variable result
 * 
 * 
 */

