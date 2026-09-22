class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        int arraySum = 0;
        
        actualSum = n * (n + 1) / 2;

        for(int num : nums){
            arraySum += num;
        }
        return actualSum - arraySum;
    }
}
