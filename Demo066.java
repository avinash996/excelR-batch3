public class Demo066 {
    
    public static void printIndexValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printIndexValues(numbers);
    }
}
