package main

import "fmt"

func FindPairWithTargetSum(input []uint32, target uint32) (int32, int32) {

	holder := make(map[uint32]int32)

	for i := range input {
		k := input[i]
		if j, ok := holder[target-k]; ok {
			return int32(i), j
		} else {
			holder[k] = int32(i)
		}

	}

	return -1, -1
}

func main() {
	fmt.Println(FindPairWithTargetSum([]uint32{1, 2, 4, 5, 6}, 6))
}
