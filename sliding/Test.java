public class Test {

    public static int findMinSubArray(int S, int[] arr) {
        // TODO: Write your code here
        int start = 0, end = 0;
        int windowSum = arr[end];
        int n = arr.length;

        int minLength = S;
        for (; start < n - 1 && end < n - 1;) {

            //System.out.printf("Begin: -- start:%d, end:%d windowSum:%d minLength=%d\n ", start, end, windowSum,
                    // minLength);

            if (windowSum >= S) {
                int len = end - start + 1;
                if (minLength > len) {
                    minLength = len;
                }
                windowSum -= arr[start];
                start++;
            } else {
                end++;
                windowSum += arr[end];
            }
        }
        for (int i=start;i<n;i++){
            if(windowSum>=S && minLength>end-start+1){
                minLength=end-start+1;
            }
            windowSum-=arr[start];
            start++;
        }
        if(minLength==S)
            minLength=0;
        System.out.println(minLength);

        return minLength;
    }

    public static void main(String... args) {
        System.out.printf("start%d \n", 12);
        Test t = new Test();
        int[] arr = { 1, 1, 1, 1, 1, 1 };
        findMinSubArray(7, arr);
    }

}