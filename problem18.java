/* Student Information System and count student numbers by static variable */

import java.util.*;
public class problem18 {
    String name, dep , id, phone;
    float cgpa;
    static String collegeName = "ABC University";
    static String collegeAddress = "123 College St, City, Country";
    static int count = 0;
    problem18(String n, String d, String i, String p, float c) {
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
                "\nYour CGPA is\t\t: " + cgpa+" \nCollege Name\t:" + collegeName +
                "\nCollege Address\t:" + collegeAddress);
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int i, x = input.nextInt();
        problem18[] s = new problem18[x];
        for (i = 0; i < x; i++) {
            String name, dep, id, phone;
            float cgpa;

            input.nextLine();
            System.out.println("\nEnter details for student " + (i + 1) + ":");
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
            s[i] = new problem18(name, dep, id, phone, cgpa);
            count++;
            System.out.println();
        }
        System.out.println("..................Details of all students..................");
        for (i = 0; i < x; i++) {
            System.out.println("\n#..Show details for student..#: " + (i + 1) + ":");
            s[i].output();
            System.out.println();
        }
        System.out.println("Total number of students: " + count);
        }
    }
    

