package Chapter_1_Arrays_and_Strings;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by johnhenning on 7/30/17.
 * Question 1.2 in CCI
 */
public class CheckPermutation {
    static boolean checkPermutation(String str1, String str2) {
        HashMap<Character, Integer> str1CharCount = new HashMap<>();
        HashMap<Character, Integer> str2CharCount = new HashMap<>();
        getCharCount(str1, str1CharCount);
        getCharCount(str2, str2CharCount);

        return str1CharCount.equals(str2CharCount);
    }

    private static void getCharCount(String str, HashMap<Character, Integer> charCounts) {
        for (char c: str.toCharArray()) {
            int charCount = charCounts.getOrDefault(c,0) + 1;
            charCounts.put(c, charCount);
        }
    }
}
