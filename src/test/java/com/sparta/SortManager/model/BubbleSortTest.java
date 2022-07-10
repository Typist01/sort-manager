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
        int[] expected = {1, 2, 3, 6};
        int[] sorterResult = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(sorterResult));
    }

    @Test
    void sortArray2() {
        int[] unsortedArray = {3, 1, 2, 1, 0, -1, -3};
        int[] sorterResult = sorter.sortArray(unsortedArray);
        int[] expected = {-3, -1, 0, 1, 1, 2, 3};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(sorterResult));
    }
}