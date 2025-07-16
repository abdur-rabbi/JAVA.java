
/*This program taking input using constructor and displays personal details for multiple individuals. */
import java.util.Scanner;

public class problem17 {
    String name, dep, phone, id;
    float cgpa;

    problem17(String n, String d, String i, String p, float c) {
        name = n;
        dep = d;
        id = i;
        phone = p;
        cgpa = c;
    }

    void output() {
        System.out.println("Your name is\t\t: " + name +
                "\nYour department is\t: " + dep +
                "\nYour ID is\t\t: " + id +
                "\nYour phone number is\t: " + phone +
                "\nYour CGPA is\t\t: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int i, x = input.nextInt();
        problem17[] s = new problem17[x];
        for (i = 0; i < x; i++) {
            String name, dep, phone, id;
            float cgpa;

            input.nextLine();
            System.out.println("\nEnter details for student: " + (i + 1) + ":");
            System.out.print("Enter your name: ");
            name = input.nextLine();
            System.out.print("Enter your department: ");
            dep = input.nextLine();
            System.out.print("Enter your ID: ");
            id = input.nextLine();
            System.out.print("Enter your phone number: ");
            phone = input.nextLine();
            System.out.print("Enter your CGPA: ");
            cgpa = input.nextFloat();
            s[i] = new problem17(name, dep, id, phone, cgpa);
            System.out.println();
        }

        System.out.print("Enter ID of the student to search for their details: ");
        input.nextLine();
        String searchID = input.nextLine();
        System.out.println("..................Details of students..................");
        for (i = 0; i < x; i++) {
            if (s[i].id.equals(searchID)) {
                System.out.println("\n#..Show details for student..#: " + (i + 1) + ":");
                s[i].output();
                System.out.println();
            }
        }
    }
}
