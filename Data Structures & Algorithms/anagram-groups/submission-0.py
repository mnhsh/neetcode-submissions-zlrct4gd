class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        chut = {}
        for s in strs:
            key = "".join(sorted(s))
            if key not in chut:
                chut[key] = [s]
            else:
                chut[key].append(s)
        return list(chut.values())