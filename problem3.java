/* This program calculates the area of a triangle and a circle */

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b, h;
        float r, C_area, T_area;
        System.err.printf("input base and height: ");
        b = input.nextInt();
        h = input.nextInt();

        System.out.printf("input radius: ");
        r = input.nextFloat();

        T_area = 0.5f * b * h;
        C_area = 3.1416f * r * r;

        System.out.println("Triangle area: " + T_area);
        System.out.println("Circle area: " + C_area);

    }
}
