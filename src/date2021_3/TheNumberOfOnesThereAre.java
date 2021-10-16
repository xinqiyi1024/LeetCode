package date2021_3;

import java.util.Scanner;

/**
 * @author FZN
 */
public class TheNumberOfOnesThereAre {
    public static int hammingWeight(int n) {
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            //n & (1 << i) 表示n的i位为0或1
            sum = ((n & (1 << i)) == 0) ? sum : sum++;
        }
        return sum;
    }
}
