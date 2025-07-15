/* This program demonstrates the use of ArrayList in Java and outputting its elements by for-each loop and removing an element from it */

import java.util.ArrayList;
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("input arrayList length: ");
        int i, x = input.nextInt();
        System.out.print("\nAdd " + x + " array elements: ");

        for (i = 0; i < x; i++) {
            arr.add(input.nextInt());
        }

        System.out.print("\nBefore removing elements Array elements are: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.print("\n\nEnter the index of the element to remove: ");
        i = input.nextInt();
        if (i >= 0 && i < arr.size()) {
            arr.remove(i);
        } else {
            System.out.print("Invalid index.");
            return;
        }

        System.out.print("\n\nAfter Removing elements from the ArrayList: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.print("\n\nSize = " + arr.size());
    }

}
