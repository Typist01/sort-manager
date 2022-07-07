package com.sparta.SortManager.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort implements Sorter {
    static final Logger logger = LogManager.getLogger("My Logger");

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
