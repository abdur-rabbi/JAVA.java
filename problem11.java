/* This program concatenates and compares two strings  */

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input first string: ");
        String s = input.nextLine();
        System.out.print("\nFirst string is: "+s);
       

        System.out.print("\ninput second string: ");
        String x = input.nextLine();
        System.out.print("\nSecond string is: "+x);
    
        // Concatenating two strings
        String FN = s + x;
        System.out.print("\n\nConcatenated string is: ");
        System.out.print(FN);
        
        if (s.equals(x)) {
            System.out.print("\n\nBoth strings are equal.");
        } else {
            System.out.print("\n\nBoth strings are not equal.");
        }
    }
}
