package com.sparta.SortManager.model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class MergeSortTest {
    MergeSort mergesort = new MergeSort();

    @Test
    void sortArray1() {
        int[] arrayToSort = {4, 2, 1};
        int[] sortedArray = {1, 2, 4};
        Assertions.assertEquals(Arrays.toString(mergesort.sortArray(arrayToSort)), Arrays.toString(sortedArray));
    }

    @Test
    void sortArray2() {
        int[] arrayToSort = {-3, 1, 0, 3, 5};
        int[] sortedArray = {-3, 0, 1, 3, 5};
        Assertions.assertEquals(Arrays.toString(mergesort.sortArray(arrayToSort)), Arrays.toString(sortedArray));
    }

}