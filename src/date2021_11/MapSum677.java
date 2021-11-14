package date2021_11;

import java.util.HashMap;
import java.util.Map;

/**
 * @description：TODO
 * @author：FZN
 * @date：2021/11/14 14:21
 */
public class MapSum677 {
    HashMap<String, Integer> map;

    public MapSum677() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key,val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().startsWith(prefix)) {
                sum += entry.getValue();
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */