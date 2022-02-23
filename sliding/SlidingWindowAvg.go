package main

import "fmt"

func main() {

	input := []int{1, 2, 4, 8, 9, 12, 15, 20, 32, 35, 38, 40}
	var k int = 5
	var sum []float64 = make([]float64, len(input))

	var start, window int

	for end := 0; end < len(input); end++ {

		fmt.Printf("input value is %d\n", input[end])
		window += input[end]
		fmt.Printf("window is %d\n", window)

		if end > k-2 {
			fmt.Printf("start %d; end: %d; window : %d\n", start, end, window)
			sum[start] = float64(window) / float64(k)
			window -= input[start]
			start++
			fmt.Printf("start %d; end: %d; window : %d\n", start, end, window)

		}

	}

	fmt.Println("result is ", sum)
}
