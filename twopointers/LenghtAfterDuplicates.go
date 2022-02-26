package main

import "fmt"

func RemovedDuplicates(input []uint32, k uint32) uint32 {

	len := len(input)

	for i := range input {
		if input[i] == k {
			len--
		}
	}
	return uint32(len)

}

func main() {
	fmt.Println(RemovedDuplicates([]uint32{3, 2, 3, 7, 3, 11, 9, 3}, 3))
}
