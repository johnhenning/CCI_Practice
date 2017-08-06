package Chapter_1_Arrays_and_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by johnhenning on 7/30/17.
 */
class CheckPermutationTest {
    @Test
    void checkPermutation() {
        assert CheckPermutation.checkPermutation("strings", "tringss");
        assert !CheckPermutation.checkPermutation("strings", "string");
    }

}