import java.util.*;

public class Palindrome {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int original = x;
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        if (rev == original) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = input.nextInt();
        Palindrome p = new Palindrome();
        System.out.println("Is " + x + " a palindrome? " + p.isPalindrome(x));
    }
}
