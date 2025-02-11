import java.util.Scanner;

public class Demo029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = new String[10];
        System.out.println("Please enter the names of 10 friends:");
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter name of friend " + (i + 1) + ": ");
            friends[i] = scanner.nextLine();
        }
        System.out.println("List of friends:");
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }
        scanner.close();
    }
}