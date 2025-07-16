/* This program collects and displays personal details for multiple individuals. */

import java.util.Scanner;

public class problem16 {
    String name, gender;
    long phone;
    int age;

    void input(Scanner input) {
        input.nextLine();
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your gender: ");
        gender = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your phone number: ");
        phone = input.nextInt();
    }

    void display() {
        System.out.println("Your name is\t: " + name + "\nYour gender is\t: " + gender +
                "\nYour age is\t: " + age + "\nYour phone number is\t: " + phone);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter details for x persons:");
        int x = input.nextInt();
        problem16[] p = new problem16[x];

        for (int i = 0; i < x; i++) {
            p[i] = new problem16();
            input.nextLine(); 
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            p[i].input(input);
            System.out.println();
        }
        System.out.println("..................Details of all persons..................");
        for (int i = 0; i < x; i++) {
            System.out.println("\n#..Show details for person..#: " + (i + 1) + ":");
            p[i].display();
            System.out.println();
        }
    }

}
