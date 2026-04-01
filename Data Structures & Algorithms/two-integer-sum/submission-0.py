class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        chut = {}
        for i in range(len(nums)):
            comp = target - nums[i]
            if comp in chut:
                return [chut[comp], i]
            else:
                chut[nums[i]] = i