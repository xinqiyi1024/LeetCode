package date2021_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FZN
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 8};
        List<Integer> ls = new ArrayList<>();
        ls.add(ls.size(),11);
        ls.add(ls.size(),12);
        ls.add(ls.size(),13);
        ls.add(ls.size(),14);
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i) == nums[i]);

        }
    }
}
