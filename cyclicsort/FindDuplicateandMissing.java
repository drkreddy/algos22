public class FindDuplicateandMissing {

    public static int[] findNumbers(int[] nums) {
        // TODO: Write your code here
        for (int i = 0; i < nums.length; ) {
            int k = nums[i] - 1;
            System.out.println("k is " + k + " i is " + i);

            if (nums[i] != nums[k]) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
            } else {
                i++;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) {
                return new int[] { nums[i], i + 1 };
            }

        }
        // findNumbers([2, 1, 3, 5, 2])

        return new int[] { -1, -1 };
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        int[] nums = { 3, 1, 2, 5, 2 };
        int[] number = findNumbers(nums);
        System.out.println(number[0] + "--" + number[1]);

    }

}
