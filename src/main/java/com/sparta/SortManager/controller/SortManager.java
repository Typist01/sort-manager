package com.sparta.SortManager.controller;

import com.sparta.SortManager.model.BinaryTree.TreeAdapter;
import com.sparta.SortManager.model.BubbleSort;
import com.sparta.SortManager.model.MergeSort;
import com.sparta.SortManager.model.MergeSortedArrays;
import com.sparta.SortManager.model.Sorter;
import com.sparta.SortManager.view.Viewer;

import java.util.Random;

public class SortManager{
    private Sorter sorter;
    private Viewer viewer;
    private Long sortTime;
    private Long sortTimeC;
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
        // 1 random sort 2. custom sort 3. merge two sorted arrays
        switch(mainChoice){
            case "1":
                randomSorter();
                break;
            case "2":
                mergeSortedArrays();
                break;
        }
    }

    private void mergeSortedArrays(){
        MergeSortedArrays mergeSorter = new MergeSortedArrays();
        int arrLength = viewer.getArrayLength();

        int[] arr1 = getRandomSortedArray(arrLength);
        viewer.printList(arr1, "Generated first sorted array");
        int[] arr2 = getRandomSortedArray(arrLength);
        viewer.printList(arr1, "Generated second sorted array");
        int[] result = mergeSorter.mergeArrays(arr1, arr2);
        viewer.printList(result, "Array sorted: ");

    }
    private int[] getRandomSortedArray(int n){
        Random rand = new Random();
        int[] arr = new int[n];
        arr[0] = rand.nextInt(10000);
        for (int i = 1; i<arr.length; i++ )
        arr[i] = arr[i-1] + rand.nextInt(10000);
        return arr;
    }

    private void randomSorter(){
        setSorter(viewer.getSortingPreference());
        int[] randomArr = getRandomArray(viewer.getArrayLength());
        viewer.printList(randomArr, "Generated random array: ");
        sortTime = sort(randomArr);
        if (viewer.userWantsToCompare()){
            setSorter(viewer.getComparisonChoice(getSorterName()));
            this.sortTimeC = sort(randomArr);
            viewer.printComparisonResult(sortTime, sortTimeC);
        }

    }

    private void setSorter(String sorterName){
        switch (sorterName){
            case "bubble":
                this.sorter = new BubbleSort();
                break;
            case "merge":
                this.sorter = new MergeSort();
                break;
            case "binary":
                this.sorter = new TreeAdapter();
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

    private Long sort(int[] inputArray){
//        Scanner scanner = new Scanner(System.in);
        Long startTime = System.nanoTime();
        int[] sortedArray = sorter.sortArray(inputArray);
        Long endTime = System.nanoTime();
        Long timeTakenInNs = (endTime-startTime);
        viewer.printList(sortedArray, "Sorted List: ");
        viewer.printTimeTaken(timeTakenInNs);
        return timeTakenInNs;
    }
}
