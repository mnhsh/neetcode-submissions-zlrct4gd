class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) !=  len(t):
            return False
        count_char={}
        for ch in s:
            if ch in count_char:
                count_char[ch] += 1
            else:
                count_char[ch] = 1
        for ch in t:
            if ch not in count_char:
                return False
            count_char[ch] -= 1
            if count_char[ch] < 0:
                return False
        return True