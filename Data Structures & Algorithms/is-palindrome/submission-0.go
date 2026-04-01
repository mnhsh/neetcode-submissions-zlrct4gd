func isPalindrome(s string) bool {
	strArr := []rune(s)
	i := 0
	j := len(strArr) - 1
	for i < j {
		for i < j && !unicode.IsLetter(strArr[i]) && !unicode.IsDigit(strArr[i]) {
			i++
		}
		for i < j && !unicode.IsLetter(strArr[j]) && !unicode.IsDigit(strArr[j]) {
			j--
		}
		if unicode.ToLower(strArr[i]) != unicode.ToLower(strArr[j]) {
			return false
		}
		i += 1
		j -= 1
	}
	return true
}
