class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int x = 0;
        int y = 0;

        arr1[x++] = nums[0];
        arr2[y++] = nums[1];

        for(int i = 2; i < n; i++){
            if(i % 2 == 0){
                arr1[x++] = nums[i];
            } else{
                arr2[y++] = nums[i];
            }
        } 
        int[] result = new int[n];

        int k = 0;

        for(int i = 0; i < x; i++){
            result[k++] = arr1[i];
        }
        for(int i = 0; i < y; i++){
            result[k++] = arr2[i];
        }   
        return result; 
    }
}
