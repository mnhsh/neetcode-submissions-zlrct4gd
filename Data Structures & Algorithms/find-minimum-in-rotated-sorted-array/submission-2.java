class Solution {
    public int findMin(int[] nums) {
      int firstTrue = -1;
      int l = 0, r = nums.length - 1;
      while (l<=r) {
         int mid = l + (r - l) / 2;
         if (nums[mid] <= nums[nums.length - 1]) {
            firstTrue = mid;
            r = mid - 1;
         } else {
            l = mid + 1;
         }
      }
      return nums[firstTrue];
    }
}
