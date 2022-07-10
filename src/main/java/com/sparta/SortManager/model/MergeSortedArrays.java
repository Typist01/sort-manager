package com.sparta.SortManager.model;

public class MergeSortedArrays {
    // merge two sorted arrays
    public int[] mergeArrays(int[] arr1, int[] arr2){
        int arrLength = arr1.length + arr2.length;
        int[] mArray = new int[arrLength];
        int i=0, j=0, k=0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                mArray[k] = arr1[i];
                i++; k++;
            } else{
                mArray[k] = arr2[j];
                j++;k++;
            }
        }
        while (i<arr1.length){
            mArray[k++] = arr1[i++];
        }
        while (j<arr2.length){
            mArray[k++] = arr2[j++];
        }
        return mArray;
    }
}
