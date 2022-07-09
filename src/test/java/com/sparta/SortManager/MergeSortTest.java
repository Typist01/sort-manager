package com.sparta.SortManager;

import com.sparta.SortManager.model.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class MergeSortTest {
    MergeSort mergesort = new MergeSort();

    @BeforeEach
    void setUp() {
    }
    @Test
    void sortArray() {
        int[] arrayToSort = {4, 2, 1};
        int[] sortedArray = {1, 2, 4};
        Assertions.assertEquals(Arrays.toString(mergesort.sortArray(arrayToSort)), Arrays.toString(sortedArray));
    }
    @Test
    void stringArray(){
        String[] myStringArray = {"asdf", "asdf"};
//        Assertions.assertThrows(mergesort.sortArray(myStringArray));
    }

}