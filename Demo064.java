public class Demo064 {
    
    public static void swapFirstAndLast(int[] arr) {
        if (arr.length > 1) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        swapFirstAndLast(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
