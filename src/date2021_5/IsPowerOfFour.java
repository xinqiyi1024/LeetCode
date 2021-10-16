package date2021_5;

/**
 * @author FZN
 */
public class IsPowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(20));

    }

    public static boolean isPowerOfFour(int n) {
            for (int i = 1; i <= n; i *= 4) {
                if (i == n) {
                    return true;
                }
            }
            return false;
    }
}