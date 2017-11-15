import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Challenge description at: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

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
