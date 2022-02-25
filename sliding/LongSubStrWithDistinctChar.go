package main

import "fmt"

func LongSubStr(k uint32, s string) uint8 {

	var start uint8 = 0

	var longest uint8 = 0

	m := make(map[uint8]uint8)
	for i := range s {
		m[s[i]] = m[s[i]] + 1

		if len(m) <= int(k) {
			if longest < uint8(i)-start+1 {
				longest = uint8(i) - start + 1
			}

		} else {

			m[s[start]] = m[s[start]] - 1
			if m[s[start]] == 0 {
				delete(m, s[start])
			}
			start++

		}
	}

	return longest
}

func main() {

	fmt.Println(LongSubStr(2, "araaci"))
	fmt.Println(LongSubStr(1, "araaci"))
	fmt.Println(LongSubStr(3, "cbbebi"))

}
