import java.util.Scanner;

class Fizz {
    public String checkFizz(int number) {
        if (number % 3 == 0) {
            return "fizz";
        }
        return "";
    }
}

class Buzz {
    public String checkBuzz(int number) {
        if (number % 5 == 0) {
            return "buzz";
        }
        return "";
    }
}

class FizzAndBuzz {
    private final Fizz fizz;
    private final Buzz buzz;

    public FizzAndBuzz() {
        fizz = new Fizz();
        buzz = new Buzz();
    }

    public String checkFizzBuzz(int number) {
        if (number <= 0) {
            return "Error: Enter a positive number.";
        }
        String result = fizz.checkFizz(number) + buzz.checkBuzz(number);

        if (!result.isEmpty()) {
            return result;
        }
        return "Enter a multiple of 3 or 5.";
    }
}

<<<<<<< HEAD
public class Demo020 {
=======
public class Demo022 {
>>>>>>> 9db397c96555ad158fca48f72b37fa4e99764e9c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FizzAndBuzz fizzAndBuzz = new FizzAndBuzz();
        System.out.print("Enter a number (multiple of 3 or 5): ");
        int number = sc.nextInt();
        String result = fizzAndBuzz.checkFizzBuzz(number);
        System.out.println(result);
        sc.close();
    }
}
