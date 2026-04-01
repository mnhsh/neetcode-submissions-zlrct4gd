func twoSum(nums []int, target int) []int {
    seen := make(map[int]int)
    for i, n := range nums {
        diff := target - n
        val, ok := seen[diff]
        if ok {
            return []int{val, i}
        }
        seen[n] = i
    }
    return []int{}
}