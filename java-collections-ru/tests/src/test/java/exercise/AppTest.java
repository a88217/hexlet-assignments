package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List actual1 = App.take(numbers1,2);
        assertThat(actual1).isEqualTo(new ArrayList<>(Arrays.asList(1, 2)));

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        List actual2 = App.take(numbers2,8);
        assertThat(actual2).isEqualTo(new ArrayList<>(Arrays.asList(7, 3, 10)));

    }
}
