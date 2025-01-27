import java.util.Scanner;

public class Demo009 {
    String cust_Name = "Avinash";
    long Account_no = 420697898;
    Double Balance = 1000000.00;

    
    void accept_details() {
        System.out.println("Enter your name and account number:");
        Scanner sc = new Scanner(System.in);
        cust_Name = sc.nextLine();  
        Account_no = sc.nextLong();  
    }

    
    void Display_details() {
        System.out.println("Hello " + cust_Name);
        System.out.println("Your balance is " + Balance);
    }

    public static void main(String[] args) {
        
        Demo009 obj = new Demo009();  
        obj.accept_details(); 
        obj.Display_details();  
    }
}
