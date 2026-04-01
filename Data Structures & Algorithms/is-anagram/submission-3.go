func isAnagram(s string, t string) bool {
    if len(s) != len(t){
        return false
    }
    seen := make(map[rune]int)
    for _, ch := range s {
        seen[ch] +=1
    }
    for _, ch := range t {
        seen[ch] -= 1
        if seen[ch] < 0 {
            return false
        }
    }
    return true
}
