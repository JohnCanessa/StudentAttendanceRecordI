import java.util.Scanner;

/**
 * 551. Student Attendance Record I
 * https://leetcode.com/problems/student-attendance-record-i/
 */
public class Solution {

    
    /**
     * Count the occurances of the specified pattern in the
     * specified strng.
     */
    static int countPattern(String pattern, String s) {

        // **** ****
        int count       = 0;
        int fromIndex   = 0;

        // **** count the pattern ****
        while ((fromIndex = s.indexOf(pattern, fromIndex)) != -1) {
            count++;
            fromIndex++;
        }

        // **** return count ****
        return count;
    }


    /**
     * Funcion that evaluates the data and returns the result.
     */
    static boolean checkRecord(String s) {

         // **** count number of "A" (absence) ****
        int count = countPattern("A", s);

        // **** check if student has more than 1 absence ****
        if (count > 1)
            return false;

        // **** count 'LL' (consecutive lates) ****
        count = countPattern("LLL", s);

        // **** more than 2 ****
        if (count != 0)
            return false;

        // **** reward student ****
        return true;
    }


    /**
     * Test scaffolding.
     */
    public static void main(String[] args) {
        
        // **** open scanner ****
        Scanner sc = new Scanner(System.in);

        // **** read input string ****
        String s = sc.nextLine();

        // **** close scanner ****
        sc.close();

        // **** compute and display result ****
        System.out.println("main <<< reward: " + checkRecord(s));
    }

}