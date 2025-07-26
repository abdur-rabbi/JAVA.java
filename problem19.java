import java.util.*;

public class problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> str = new LinkedList<>();
        System.out.print("Enter string length: ");
        int i, x = input.nextInt();
        System.out.print("Add " + x + " string elements are: ");
        for (i = 0; i < x; i++) {
            str.add(input.nextLine());
        }
        System.out.print("Before removal elements are: ");
        System.out.println(str);
        System.out.println("\nSize = " + str.size());
        System.out.print("Enter index number of element to remove: ");
        i = input.nextInt();
        if (i >= 0 && i < str.size()) {
            str.remove(i);
        } else {
            System.out.println("Invalid index.");
            return;
        }
        System.out.print("After removal and updated array is: ");
        for (String s : str) {
            System.out.print(s + " ");
        }
        System.out.println("\nFinal size of the array: " + str.size()); 
    }
}
