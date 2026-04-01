func topKFrequent(nums []int, k int) []int {
    count := make(map[int]int)
    for _, n := range nums {
        count[n]++
    }
    buckets := make([][]int, len(nums)+1)
    for num, freq := range count {
        buckets[freq] = append(buckets[freq], num)
    }

    res := []int{}
    for freq := len(buckets) - 1; freq >= 0 && len(res) < k; freq-- {
        for _, num := range buckets[freq] {
            if len(res) >= k {
                break
            }
            res = append(res, num)
        }
    }
    return res
}
