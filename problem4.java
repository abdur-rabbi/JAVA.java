                /* This program takes an array input and calculates the sum of even and odd numbers */

import java.util.Scanner;
import java.util.Random;

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int x, i, evsum = 0, oddsum = 0;
        System.out.printf("input array length: ");
        x = input.nextInt();
        int[] arr = new int[x];
        System.out.printf("Array elements are: ");

        for (i = 0; i < x; i++) {
            arr[i] = rand.nextInt(10) + 5;
            System.out.printf(arr[i] + " ");
        }

        System.out.println("\n\nEven number: ");
        for (i = 0; i < x; i++) {
            if (arr[i] % 2 == 0) {
                evsum += arr[i];
                System.out.printf(arr[i] + " ");
            }
        }

        System.out.println("\n\nOdd number: ");
        for (i = 0; i < x; i++) {
            if (arr[i] % 2 != 0) {
                oddsum += arr[i];
                System.out.printf(arr[i] + " ");
            }
        }

        System.out.printf("\n\nTotal evensum: %d\nTotal oddsum: %d", evsum, oddsum);
    }
}
