func groupAnagrams(strs []string) [][]string {
    grp := make(map[string][]string)
    for _, s := range strs {
        splited := strings.Split(s, "")
        sort.Strings(splited)
        sortedS := strings.Join(splited, "")
        grp[sortedS] = append(grp[sortedS], s)
    }
    res := [][]string{}
    for _, v := range grp {
        res = append(res, v)
    }
    return res
}