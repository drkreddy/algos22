package main

import "fmt"

func minArray(s uint32, input []uint32) uint32 {

	var start, end, sum uint32 = 0, 0, 0
	var maxLength uint32 = (1 << 32) - 1
	fmt.Printf("Start %d,End %d, maxLength:%d ", start, end, maxLength)
	for ; end < uint32(len(input)); end++ {
		sum += input[end]
		for sum >= s {
			if maxLength > end-start+1 {
				maxLength = end - start + 1
			}
			sum -= input[start]
			start++
		}

	}

	if maxLength == (1<<32)-1 {
		return 0
	}

	return maxLength
}

func main() {

	fmt.Println("Starting the program")
	fmt.Printf("input: %v,sum:%d, result:%d \n", []uint32{1, 3, 4, 2, 1, 1}, 7, minArray(7, []uint32{1, 3, 4, 2, 1, 1}))
	fmt.Printf("input: %v,sum:%d, result:%d \n", []uint32{1, 3, 2, 1, 3, 2}, 4, minArray(4, []uint32{1, 3, 2, 1, 3, 1}))

}
