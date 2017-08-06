package Chapter_1_Arrays_and_Strings;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by johnhenning on 8/2/17.
 */
class URLifyTest {
    @Test
    void urlify() {
        assertEquals("Mr%20John%20Smith", URLify.urlify("Mr John Smith    ".toCharArray(), 13));
    }

}