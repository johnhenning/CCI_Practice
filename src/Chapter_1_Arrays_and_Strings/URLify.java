package Chapter_1_Arrays_and_Strings;

import java.util.Arrays;

/**
 * Created by johnhenning on 8/2/17.
 */
class URLify {
    static String urlify(char[] inputString, int string_length) {
        int spaceCount = (inputString.length - string_length) / 2;
        int seenSpaces = 0;
        int lastStop = string_length - 1;
        int lastEnd = inputString.length - 1;
        for (int i = string_length - 1; i >= 0; i--) {
            char c = inputString[i];
            if (seenSpaces >= spaceCount) {
                break;
            }
            if (c == ' ') {
                seenSpaces++;
                int temp = lastStop - i;
                int diff = lastEnd - lastStop;
                int j;
                for (j = lastStop; j > i; j--) {
                    inputString[j+diff] = inputString[j];
                }
                inputString[j+diff] = '0';
                inputString[j-1+diff] = '2';
                inputString[j-2+diff] = '%';
                lastEnd = j - 3 + diff;
                lastStop = i - 1;
            }
        }
        return String.valueOf(inputString);
    }
}
