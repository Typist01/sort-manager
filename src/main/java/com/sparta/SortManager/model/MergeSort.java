package com.sparta.SortManager.model;

import java.util.Arrays;

public class MergeSort implements Sorter {
    public int[] sortArray(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr;
//        int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length / 2);
//        int[] arr2 = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        int[] arr1 = sortArray(Arrays.copyOfRange(arr, 0, arr.length / 2));
        int[] arr2 = sortArray(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
        return merge(arr1, arr2);
    }

    int[] merge(int[] arr1, int[] arr2) {
        int arrLength = arr1.length + arr2.length;
        int[] mArray = new int[arrLength];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            mArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mArray[k++] = arr2[j++];
        }
        return mArray;
    }
}
