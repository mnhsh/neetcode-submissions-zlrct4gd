class Solution {
    public int findMin(int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int n : nums) {
            res = Math.min(res, n);
        }
        return res;
    }
}
