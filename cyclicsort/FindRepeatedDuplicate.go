package main

import "fmt"

func duplicates(input []uint32) []uint32 {

	var duplicates []uint32 = []uint32{}

	var i int = 0

	for i < len(input) {

		if input[i] == input[input[i]-1] {

			if input[i] != uint32(i)+1 {
				duplicates = append(duplicates, input[i])
			}

			i++
		} else {
			input[i], input[input[i]-1] = input[input[i]-1], input[i]
		}

	}

	return duplicates

}

func main() {
	fmt.Println(duplicates([]uint32{3, 2, 4, 1, 3}))
}
