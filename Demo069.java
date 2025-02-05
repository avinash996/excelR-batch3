public class Demo069 {
    
    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Sum of all elements: " + sumOfElements(numbers));
    }
}
