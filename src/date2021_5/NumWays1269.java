package date2021_5;

/**
 * @author FZN
 */
public class NumWays1269 {
    //返回方案数
    public int numWays(int steps, int arrLen) {
        /*
         *sum用来统计方案数
         *theFactCount用与实时计数0<=theFactCount<=arrLen
         */
        int sum = 1;
        int theFactCount = 0;
        int maxKey;
        int x,y,z;
        if (steps % 1<<1 == 1) {
            steps--;
            y = 1;
            x = z = steps / 2;
            maxKey = x > arrLen ? arrLen : steps;

        }

        return 1;
    }
}
