
class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bits = new int[31];
        long ans = 0;

        for (int num : nums){
            for (int i = 0; i < 31; i++){
                if ((num & (1 << i)) != 0){
                    bits[i]++;
                }
            }
        }
        for (int j = 0; j < k; j++){
            long x = 0;

            for (int i = 0; i < 31; i++){
                if (bits[i] > 0) {
                    x |= (1L << i);
                    bits[i]--;
                }
            }
            ans = (ans + x * x) % 1000000007;
        }
        return (int) ans;
    }
}
