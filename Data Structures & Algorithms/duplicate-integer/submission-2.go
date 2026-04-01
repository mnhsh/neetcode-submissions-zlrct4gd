func hasDuplicate(nums []int) bool {
    m := make(map[int]int)
    for _, n:= range nums {
        if m[n] >= 1{
            return true
        }
        m[n] += 1
    }
    return false
}
