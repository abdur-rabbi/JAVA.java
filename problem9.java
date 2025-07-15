/*This program demonstrates the use of ArrayList in Java */

import java.util.Scanner;
import java.util.ArrayList;

public class problem9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.print("input arrayList length: ");
    int i, x = input.nextInt();
    System.out.print("\nAdd " + x + " array elements: ");

    for (i = 0; i < x; i++) {
      arr.add(input.nextInt());
    }

    System.out.print("\nArray elements are: ");
    System.out.print(arr);
    System.out.print("\nSize = " + arr.size());

  }

}
