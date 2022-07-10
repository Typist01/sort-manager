package com.sparta.SortManager.model;

import com.sparta.SortManager.model.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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


}