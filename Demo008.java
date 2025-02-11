import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        String loginid = "";
        String pwd = "";
        String reply;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcome to Malla Reddy University");
            System.out.println("Have you visited our site earlier? (yes/no)");
            reply = sc.nextLine();

            if (reply.equalsIgnoreCase("no")) {
                System.out.println("Login here");
                System.out.println("Enter your ID and password:");
                loginid = sc.nextLine();
                pwd = sc.nextLine();
            } else {
                System.out.println("You are a returning customer.");
            }

            // Check login credentials
            if (loginid.equals("akarsh") && pwd.equals("12345")) {
                System.out.println("Login successful!");
                break;  // Exit the loop if credentials are correct
            } else {
                System.out.println("Invalid login. Please try again.");
            }

        } while (true);  // Loop until correct credentials are entered
    }
}
