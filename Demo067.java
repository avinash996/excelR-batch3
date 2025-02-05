public class Demo067 {
    
    public static void printEvenElements(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35, 40};
        printEvenElements(numbers);
    }
}
