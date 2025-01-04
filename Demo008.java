import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String pwd;
        String reply;
        String loginid = "";  
        boolean loggedIn = false;  

        do {
            System.out.println("Welcome to Mallareddy University");
            System.out.println("Have you visited earlier? (yes/no)");
            reply = sc.nextLine();

            if (reply.equalsIgnoreCase("no")) {  
                System.out.println("Login here");
                System.out.println("Enter your ID and password:");

                loginid = sc.nextLine();  
                pwd = sc.nextLine();  

                
                if (loginid.equals("avinash") && pwd.equals("1232567")) {
                    System.out.println("Login successful!");
                    loggedIn = true;
                } else {
                    System.out.println("Incorrect ID or password.");
                }

            } else if (reply.equalsIgnoreCase("yes")) {
                System.out.println("You are our valued customer.");
                loggedIn = true;
            } else {
                System.out.println("Invalid response. Please answer 'yes' or 'no'.");
            }

        } while (!loggedIn);  

        sc.close(); 
    }
}
