import java.util.*;

public class hashMap {

    public static void main(String[] args) {
        String name;
        int id;

        HashMap<Integer, String> customer = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total customer number: ");
        int i, x = input.nextInt();
        for (i = 0; i < x; i++) {
            System.out.print("Input customer details for: " + (i + 1));
            input.nextLine();  
            System.out.print("\nEnter customer name: ");
            name = input.nextLine();
            System.out.print("Enter customer id: ");
            id = input.nextInt();
            customer.put(id, name);
            System.out.println("Customer details added successfully!");

        }
        System.out.println("........Customer details........");
        for (HashMap.Entry<Integer, String> entry : customer.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
 
    }
}
