package binarySearch;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
         int start = 0;
         int end = arr.length - 1;

         while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // you are in dec part of array
                // this may be answer, but look at left
                end = mid;
            }else {
                // you are in asc part of array
                start = mid + 1;
            }
         }

         return start;
    }
}
