                                /* This program adds two 2D arrays */

import java.util.Scanner;
import java.util.Random;
public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int m, n, i, j;
        System.out.printf("input array row and colum: ");
        m = input.nextInt();
        n = input.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] arr3 = new int[m][n];

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr1[i][j] = rand.nextInt(10) + 5;
                arr2[i][j] = rand.nextInt(15) + 5;
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("\n\nFirst array is: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n\nSecond array is: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n\nFinal array is: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
