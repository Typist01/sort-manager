package com.sparta.SortManager;

import java.util.Arrays;

public class MergeSort implements Sorter{

    @Override
    public int[] sortArray(int[] arr) {
        int n = arr.length;
        if (n==1)
            return arr;
        int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);

        arr1 = sortArray(arr1);
        arr2 = sortArray(arr2);

        return merge(arr1, arr2);

    }

    int[] merge(int[] a, int[] b){
        int[] c;
        while (a.length>0 && b.length>0);{
            if (a[0]>b[0]){
            }
        }

        int[] array = {1, 2};
        return array;

    }
}
