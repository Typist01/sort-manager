package com.sparta.SortManager.controller;

import com.sparta.SortManager.model.BubbleSort;
import com.sparta.SortManager.model.MergeSort;
import com.sparta.SortManager.model.Sorter;
import com.sparta.SortManager.view.Viewer;

import java.util.Arrays;
import java.util.Random;
import java.util.Timer;

public class SortManager{
    private Sorter sorter;
    private Viewer viewer;
//    log files can be used for normal operations
//    can also be used to record errors
//public SortManager(String sorterName){
//        switch(sorterName){
//            case "bubble":
//                sorter = new BubbleSort();
//            case "merge":
//                sorter = new MergeSort();
//            default:
//                System.out.println("Invalid name, defaulting to bubble sort.\nsetSorter() is available.");
//                sorter = new BubbleSort();
//        }
//    }
    public SortManager(){
            this.viewer = new Viewer();
    //        this("bubble");
        }

    public void start(){
        Viewer viewer = new Viewer();
        String mainChoice = viewer.getMainChoice();
        switch(mainChoice){
            case "1":
                randomSorter();
                break;
            case "2":
                break;

        }

    }

    private void randomSorter(){
        setSorter(viewer.getSortingPreference());
        int[] randomArr = getRandomArray(viewer.getArrayLength());
        viewer.printList(randomArr, "Generated random array:");
        int[] result = sort(randomArr);
        viewer.printList(result, "Array sorted:");
    }

    private void setSorter(String sorterName){
        switch (sorterName){
            case "bubble":
                this.sorter = new BubbleSort();
                break;
            case "merge":
                this.sorter = new MergeSort();
                break;
            default:
                sorter = new BubbleSort();
        }
    }

    private int[] getRandomArray(int n){
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i=0; i<arr.length; i++){
            arr[i] = rand.nextInt();
        }
        return arr;
    }

    private String getSorterName(){
        return sorter.getClass().getSimpleName();
    }


    private int[] sort(int[] inputArray){
//        Scanner scanner = new Scanner(System.in);
        Long startTime = System.nanoTime();
        int[] sortedArray = sorter.sortArray(inputArray);
        Long endTime = System.nanoTime();
        double timeTakenInSeconds = (startTime-endTime)/1000000000.0;
        viewer.printTimeTaken(timeTakenInSeconds);
        return inputArray;
    }
}
