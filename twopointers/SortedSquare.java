package twopointers;

class SortedArraySquares {

    public static int[] makeSquares(int[] arr) {
      int[] squares = new int[arr.length];
      int i=arr.length-1;
      int left=0;
      int right=squares.length-1;
      int leftsum=0,rightsum=0;
      while (left<right) {
        leftsum=arr[left]*arr[left];
        rightsum=arr[right]*arr[right];
  
        if(leftsum<rightsum){
          squares[i--]=rightsum;
          right--;
        }{
          squares[i--]=leftsum;
          left++;
        }
  
      }
  
   
      return squares;
    }
  }