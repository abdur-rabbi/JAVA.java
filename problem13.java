/*This program converts numbers between binary, octal, hexadecimal, and decimal systems*/

import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //binary, octal, hexadecimal to decimal
        System.out.print("Input(binary or octal or hexadecimal) number: ");
        String b = input.nextLine();
        System.out.print("Input base (2 for binary, 8 for octal, 16 for hexadecimal): ");
        int base = input.nextInt();
        Integer d = Integer.parseInt(b, base);
        System.out.print("\nDecimal is: " + d);

        //decimal to binary, octal, hexadecimal

        System.out.print("\nInput a decimal number: ");
        int decimal=input.nextInt();
        String binary= Integer.toBinaryString(decimal);
        String octal= Integer.toOctalString(decimal);
        String hx= Integer.toHexString(decimal);
        System.out.print("\nBinary is: " + binary);
        System.out.print("\nOctal is: " + octal);
        System.out.print("\nHexadecimal is: " + hx);
    }
}
