class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, maxWater = 0;
        while (l < r) {
            int curWater = Math.min(heights[l], heights[r]) * (r - l);
            maxWater = Math.max(maxWater, curWater);
            if (heights[l] < heights[r]) l++;
            else r--;
        }
        return maxWater;
    }
}
