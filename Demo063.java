public class Demo063 {
    
    public static int sumFirstAndLast(int[] arr) {
        if (arr.length > 0) {
            return arr[0] + arr[arr.length - 1];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Sum of first and last element: " + sumFirstAndLast(numbers));
    }
}
