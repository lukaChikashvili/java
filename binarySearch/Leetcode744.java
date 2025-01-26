package binarySearch;
/*
 * You are given an array of characters letters that is sorted in non-decreasing order, 
 * and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target.
 If such a character does not exist, return the first character in letters.

 Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' 
in letters is 'c'.

 
 */

public class Leetcode744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);


    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letters[mid]) {
                end = mid  - 1;
            }else {
                start = mid + 1;
            }

        }

      return letters[start % letters.length];
    }
}
