package orderly;

import java.util.HashMap;

/**
 * @author FZN
 * date19
 */
public class TheSumOfTwoNumbers1 {
    public static int[] twoSum(int[] nums, int target) {
        int le = nums.length;
        //建立hashmap表,循环,将值与目标的差和下标存入map表中,如有相同则返回
        HashMap<Integer, Integer> mp = new HashMap<>(le - 1);
        mp.put(nums[0], 0);
        for (int i = 1; i < le; i++) {
            int another = target - nums[i];
            if (mp.containsKey(another)) {
                return new int[]{i, mp.get(another)};
            }
            mp.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(
                twoSum(new int[]{19, 5, 6, 7}, 12)
        );
    }
}
