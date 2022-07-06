package com.sparta.SortManager;
public class BubbleSort implements Sorter {
    public int[] sortArray(int[] inputArray){
        int temp;
        boolean arraySorted = true;
        while (arraySorted) {
            arraySorted = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                    arraySorted = true;
                }
            }
        }
        return inputArray;
    }
}
