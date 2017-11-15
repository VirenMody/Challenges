import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// HackerRank.com
// Challenge: Arrays: Left Rotation (https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem)
/* 
DESCRIPTION
  A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array [1, 2, 3, 4, 5] , then the array would become [3, 4, 5, 1, 2].

  Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format
  The first line contains two space-separated integers denoting the respective values of n (the number of integers) and d (the number of left rotations you must perform). 
  The second line contains n space-separated integers describing the respective elements of the array's initial state.

Constraints
  1 <= n <= 10^5
  1 <= d <= n
  1 <= ai <= 10^6

Output Format
  Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input
  5 4
  1 2 3 4 5

Sample Output
  5 1 2 3 4

Explanation
  When we perform d = 4 left rotations, the array undergoes the following sequence of changes:
  [1, 2, 3, 4, 5] -> [2, 3, 4, 5, 1] -> [3, 4, 5, 1, 2] -> [4, 5, 1, 2, 3] -> [5, 1, 2, 3, 4]
  Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.
*/

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
      int rotatedArr[] = new int[n];
                   
      /*
      
      Solution #1
      for(int x = 0; x < n; x++)
      {
          // Just shift the array if index is within bounds
          if( x - k >= 0)
            rotatedArr[x-k] = a[x];
          // Otherwise start from the end of the array and shift
          else
            rotatedArr[x-k+n] = a[x];              
      }
      
      */

      // Solution #2
      for (int x = 0; x < n; x++)
      {
          // Start at current position, find index k spots higher which must shift, then mod 'n' to get within bounds
          rotatedArr[x] = a[(x + k) % n];
      }

      return rotatedArr; 
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
