package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    @Test
    void quickSort() {
        int[] array = {3, 4, 1, 5, 2};
        Main.quickSort(array, 0, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}