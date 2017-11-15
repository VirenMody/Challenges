import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {

        if(first.length() == 0)
            return second.length();
        if(second.length() == 0)
            return first.length();
        
        char firstAsArr[] = first.toCharArray();
        char secondAsArr[] = second.toCharArray();

        Arrays.sort(firstAsArr);
        Arrays.sort(secondAsArr);

        int numToDelete = 0, i = 0, j = 0;
        while(i < firstAsArr.length && j < secondAsArr.length) {
            
            if(firstAsArr[i] == secondAsArr[j]) {
                i++;
                j++;
            }
            else if(firstAsArr[i] < secondAsArr[j]) {
                i++;
                numToDelete++;
            }
            else { //(firstAsArr[i] > secondAsArr[j])
                j++;
                numToDelete++;
            }
        }
        
                    
        if(i >= firstAsArr.length) {
            numToDelete += secondAsArr.length - j;
        }
        if(j >= secondAsArr.length) {
            numToDelete += firstAsArr.length - i;
        }
        
        return numToDelete;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
