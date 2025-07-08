/* This program generates an array of random integers and finds the maximum and minimum values.*/

import java.util.Scanner;
import java.util.Random;

public class problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.printf("Input array length: ");
        int i, x = input.nextInt();
        int[] arr = new int[x];

        System.out.printf("Array elements are: ");
        for (i = 0; i < x; i++) {
            arr[i] = rand.nextInt(10) + 5;
            {
                System.out.printf(arr[i] + " ");
            }
        }

        int max, min;
        max = min = arr[0];

        System.out.printf("\n\nMaximum element is: ");
        for (i = 0; i < x; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.printf(max + " ");

        System.out.printf("\n\nMinimum element is: ");
        for (i = 0; i < x; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            } 
        }
        System.out.printf(min + " ");
    }

}
