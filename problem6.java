/* This program takes a string input and counts the number of vowels, consonants, digits, whitespace, and special characters */

import java.util.Scanner;
import java.util.Random;

public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("input any string: ");
        String s = input.nextLine();
        char[] str = s.toCharArray();
        System.out.printf("\nThe input string is: ");
        System.out.printf(new String(str) + " ");
        int i, l = 0, v = 0, c = 0, d = 0, sb = 0, w = 0;
        for (i = 0; i < str.length; i++) {
            l++;
        }
        System.out.println("\n\nThe string length is: " + l);

        for (i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z' || str[i] >= 'a' && str[i] <= 'z') {
                if (str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U' || str[i] == 'a'
                        || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                    v++;
                } else {
                    c++;
                }
            } else if (str[i] >= '0' && str[i] <= '9') {
                d++;
            } else if (str[i] == ' ') {
                w++;
            }

            else {
                sb++;
            }
        }
        System.out.printf(
                "Number of vowel character is: %d\nNumber of consonant character is: %d\nNumber of digit character is: %d\nNumber of whitespace character is: %d\nNumber of special character is: %d",
                v, c, d, w, sb);

    }
}
