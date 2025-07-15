/* This program demonstrates the use of arrays in Java and the sorting of array(assending and descending) elements*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Input array length: ");
        int i, x = input.nextInt();
        int[] arr = new int[x];

        System.out.print("Input array elements: ");
        for (i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Array elements are: ");
        for (i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nArray elements in assending order: ");
        Arrays.sort(arr);
        for (i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
    }

    System.out.println("\n\nArray elements in decending order: ");
    for(i=x-1; i>=0; i--){
        System.out.print(arr[i]+" ");
    }
}
}
