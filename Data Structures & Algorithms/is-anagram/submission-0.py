class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dic1={}
        for ch in s:
            if ch not in dic1:
                dic1[ch] = 1
            else:
                dic1[ch]+=1
        dic2={}
        for ch in t:
            if ch not in dic2:
                dic2[ch] = 1
            else:
                dic2[ch]+=1
        return dic1 == dic2