import java.util.ArrayList;
import java.util.List;

public class Demo081 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2}; // Example array
        
        System.out.println("Leader elements: " + findLeaders(arr));
    }
    
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        
        leaders.add(maxFromRight);
        
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }
        
        return leaders;
    }
}
