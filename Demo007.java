import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
        String name;
        int age;
        long phno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        name = sc.nextLine();
        System.out.println("Please enter your age:");
        age = sc.nextInt();
        System.out.println("Please enter your phone number:");
        phno = sc.nextLong();
        System.out.println("Hello " + name + ", your age is " + age + " and your phone number is " + phno);
    }
}
