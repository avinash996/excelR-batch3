import java.util.Arrays;

public class Demo080 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        shiftLeft(arr);
        
        System.out.println("Array after left shift: " + Arrays.toString(arr));
    }
    
    public static void shiftLeft(int[] arr) {
        if (arr.length <= 1) return; // No need to shift if array has 0 or 1 element
        
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }
}
