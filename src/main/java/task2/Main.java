package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 6, 3, 2, 5, 1, 4, 2};
        System.out.println(Arrays.toString(array));
        int begin = 0;
        int end = array.length - 1;
        quickSort(array, begin, end);
        System.out.println(Arrays.toString(array));
    }

    static int partition(int[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
}
