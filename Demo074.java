public class Demo074 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2 };

        // Sorting logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swapping elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    // Printing array after each swap
                    System.out.print("After swapping " + arr[i] + " and " + arr[j] + ": ");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
