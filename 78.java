class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        helper(nums, 0, new ArrayList<Integer>(), answer);
        return answer;
    }

    public void helper(int[] nums, int index, List<Integer> current,
                       List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(nums[index]);
        helper(nums, index + 1, current, result);

        // Backtrack: remove the current element
        current.remove(current.size() - 1);

        // Exclude the current element
        helper(nums, index + 1, current, result);
    }
}
