package searching;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] arr = {124, 345, 2, 6, 7896};
        System.out.println(findEven(arr));
    }

    static int findEven(int[] arr) {
        int evenCount = 0;

       for(int i = 0; i < arr.length; i++) {
          int length = Integer.toString(arr[i]).length();
          
         if(length % 2 == 0) {
            evenCount++;
         }
         

       }

       return evenCount;
    }
}
