package Chapter_1_Arrays_and_Strings;

import org.junit.jupiter.api.Test;

/**
 * Created by johnhenning on 7/30/17.
 */
class IsUniqueTest {
    @Test
    void isUniqueOptimized() {
        assert !IsUnique.isUniqueOptimized("test");
        assert IsUnique.isUniqueOptimized("john");
    }

    @Test
    void isUnique() {
        assert !IsUnique.isUniqueWithHashMap("test");
        assert IsUnique.isUniqueWithHashMap("John j");
    }

}