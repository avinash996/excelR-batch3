public class Demo068 {
    
    public static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35, 40};
        System.out.println("Count of even numbers: " + countEvenNumbers(numbers));
    }
}
