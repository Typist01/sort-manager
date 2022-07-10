package com.sparta.SortManager.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {

    MergeSortedArrays sorter = new MergeSortedArrays();

    @Test
    void mergeArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};
        int[] sorterResult = sorter.mergeArrays(arr1, arr2);
        int[] expected  = {1, 2, 2, 3, 3, 4};
        assertEquals(Arrays.toString(sorterResult), Arrays.toString(expected));
    }

}