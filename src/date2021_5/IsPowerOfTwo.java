package date2021_5;

/**
 * @author FZN
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n > 1) {
            for (int i = n; i % 4 == 0; i /= 4) {
                if (i == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
