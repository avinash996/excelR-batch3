import java.util.Arrays;

public class Demo082 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7}; // First array
        int[] arr2 = {2, 4, 6, 8}; // Second array
        
        int[] mergedArray = mergeArrays(arr1, arr2);
        
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        
        return mergedArray;
    }
}
