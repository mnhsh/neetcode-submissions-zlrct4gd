class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numIndices.containsKey(diff)) {
                return new int[] {numIndices.get(diff), i};
            }
            numIndices.put(nums[i], i);
        }
        return new int[] {};
    }
}
