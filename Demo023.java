import java.util.*;

public class Demo023a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(number));
        sc.close();
    }
}

class Palindrome {
    int isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
            return 1;
        } else {
            return 0;
        }
    }
}
