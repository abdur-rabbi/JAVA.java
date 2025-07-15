/*This program input subject mark and calculate parcentage */


import java.util.* ;
public class problem14 {
    public static void main(String[] args) {
         System.out.print("input a number how many subjects marks you want to enter:  ");
        Scanner input = new Scanner(System.in);
        int  i,n = input.nextInt();  
        int[] marks = new int[n];
        System.out.println("Enter the marks for " + n + " subjects:");
        for ( i = 0; i < n; i++) {
            marks[i] = input.nextInt();
            try {
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new IllegalArgumentException("Marks must be between 0 and 100.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                i--; // Decrement i to re-enter the mark for this subject
            }
            
        }
        int sum = 0;
        for ( i = 0; i < n; i++) {
            sum += marks[i];
        }
        float average = (float) sum / n;
        System.out.println("The percentage marks is: " + average + "%");
    }
}
