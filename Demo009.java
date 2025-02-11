import java.util.Scanner;

public class Demo009 {
    long Account_no = 123456;
    Double Balance = 100000.00;
    Scanner sc = new Scanner(System.in);
    String cust_Name = sc.nextLine();

    void accept_details() {
        System.out.println("Enter your name and account number:");

        Account_no = sc.nextLong();
    }

    void Display_details() {
        String cust_Name;
        System.out.println("Hello " + cust_Name);
        System.out.println("Your balance is " + Balance);
    }

    public static void main(String[] args) {
        Demo009 obj = new Demo009();
        obj.accept_details();
        obj.Display_details();
    }
}
