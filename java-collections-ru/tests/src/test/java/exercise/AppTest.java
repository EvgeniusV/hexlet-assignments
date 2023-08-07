package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    private List<Integer> listTest;

    @BeforeEach
    void initListTest(){
        this.listTest = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
    @Test
    void testTake() {
        // BEGIN
        List<Integer> actual = List.of(1, 2, 3, 4, 5);
        List<Integer> result = App.take(listTest, 5);
        Assertions.assertEquals(actual, result);

        List<Integer> result2 = App.take(listTest, 20);
        Assertions.assertEquals(listTest, result2);

        List<Integer> actual2 = new ArrayList<>();
        List<Integer> result3 = App.take(listTest, 0);
        Assertions.assertEquals(actual2, result3);

        // END
    }
}
