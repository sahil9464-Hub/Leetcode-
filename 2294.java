class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int groups = 1;
        int start = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] - start > k){
                groups++;
                start = nums[i];
            }
        }
        return groups;
    }
}
