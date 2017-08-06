package Chapter_1_Arrays_and_Strings;

import java.util.HashMap;

/**
 * Created by johnhenning on 7/30/17.
 * Question 1.1 in CCI
 */
class IsUnique {
    static boolean isUniqueWithHashMap(String str) {
        boolean[] charMap = new boolean[128];
        for (int c: str.toCharArray()) {
            if (charMap[c]) {
                return false;
            } else {
                charMap[c] = true;
            }
        }
        return true;
    }

    static boolean isUniqueOptimized(String str) {
        int checker = 0;
        for (int c: str.toCharArray()) {
            int val = c - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
