package com.sparta.SortManager.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort sorter;

    @BeforeEach
    void setUp() {
        sorter = new BubbleSort();
    }

    @Test
    void sortArray() {
        int[] unsortedArray = {3, 2, 1, 6};
        int[] sortedArray = {1, 2, 3, 6};
        int[] sorterResult = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(sorterResult));
    }
}