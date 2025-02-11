public class LeetCode002 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int x1 = 123;
        int x2 = -123;
        int x3 = 120;

        System.out.println("Input: " + x1 + ", Reversed: " + solution.reverse(x1));
        System.out.println("Input: " + x2 + ", Reversed: " + solution.reverse(x2));
        System.out.println("Input: " + x3 + ", Reversed: " + solution.reverse(x3));
    }
}

class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10)
                return 0;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
