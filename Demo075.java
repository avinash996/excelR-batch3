// write a java program to find maximum number of an array.

import java.util.Scanner;

public class Demo075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number in array is " + max);
        sc.close();
    }
}
// output
// Enter the size of array
// 5
// Enter the elements of array
// 1
// 2
// 3
// 4
// 5
// Maximum number in array is 5
