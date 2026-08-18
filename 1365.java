class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=countSmaller(nums[i],nums);
        }
        return arr;
    }

    int countSmaller(int num,int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<num){
                count++;
            }
        }
        return count;
    }
}
