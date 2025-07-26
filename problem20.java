/* Student Management System by LinkList */

import java.util.*;

public class problem20 {
    String name, id, phone;
    float cgpa;

    problem20(String n, String i, String p, float c) {
        name = n;
        id = i;
        phone = p;
        cgpa = c;
    }

    public static void main(String[] args) {
        LinkedList<problem20> students = new LinkedList<>();
        System.out.print("Enter number of students: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.nextLine();
        for (int i = 0; i < x; i++) {
            String name, id, phone;
            float cgpa;
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter name: ");
            name = input.nextLine();
            System.out.print("Enter ID: ");
            id = input.nextLine();
            System.out.print("Enter phone: ");
            phone = input.nextLine();
            System.out.print("Enter CGPA: ");
            cgpa = input.nextFloat();
            input.nextLine();
            problem20 student = new problem20(name, id, phone, cgpa);
            students.add(student);
        }
        input.close();
        System.out.println("Details of all students:");
        for (problem20 student : students) {
            System.out.println("\n#..Show details for student..#: ");
            System.out.println("Name\t\t: " + student.name + "\nID\t\t: " + student.id + "\nPhone\t\t: " + student.phone
                    + "\nCGPA\t\t: " + student.cgpa);
        }
    }
}
