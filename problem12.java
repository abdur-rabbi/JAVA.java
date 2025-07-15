/* This program checks whether a string is a palindrome or not */

import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input a string: ");
        String s1 = input.nextLine();
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        System.out.print(s2);
        if (s1.equals(s2))
            System.out.print("\nIt's palindrome.");
        else
            System.out.print("\nNot palindrome.");

    }
}
