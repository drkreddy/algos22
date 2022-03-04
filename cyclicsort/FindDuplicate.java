// package cyclicsort;

public class FindDuplicate {


    private static int findNumber(int[] nums) {
        int[] arr=nums;
        int i=0;
        while(i<arr.length){
            if(arr[i]!=arr[arr[i]-1]){
                    swap(arr,i,arr[i]-1);
            }else if(arr[i]!=i+1){
                return arr[i];
            }else{
                i++;
            }
        }
        return -1;
    }

    private static void swap(int[] arr,int i,int j){
        int one=arr[i];
        int two=arr[j];
        arr[i]=two;
        arr[j]=one;

    }
    public static void main(String []args) {
        int[] a={1, 3, 1, 2, 4};;
        System.out.println("--"+findNumber(a));
        
    }


}