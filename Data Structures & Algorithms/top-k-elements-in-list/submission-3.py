class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        n_count = {}
        for n in nums:
            if n in n_count:
                n_count[n] += 1
            else:
                n_count[n] = 1
        return sorted(n_count, key=n_count.get, reverse=True)[:k]
