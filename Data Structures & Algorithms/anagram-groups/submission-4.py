class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = {}
        for s in strs:
            sortedS = ''.join(sorted(s))
            if sortedS not in group:
                group[sortedS] = []
                
            group[sortedS].append(s)
        return list(group.values())