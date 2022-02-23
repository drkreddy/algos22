package main

import "fmt"

func main() {

	input := []int{1, 2, 4, 4, 3, 3, 3, 1}
	var k int = 3

	var start, window, max int

	for end := 0; end < len(input); end++ {

		fmt.Printf("input value is %d\n", input[end])
		window += input[end]
		fmt.Printf("window is %d\n", window)

		if end > k-2 {
			if max < window {
				max = window
			}
			window -= input[start]
			start++

		}

	}

	fmt.Println("result is ", max)
}
