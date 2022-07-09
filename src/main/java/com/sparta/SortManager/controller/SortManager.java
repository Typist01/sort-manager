package com.sparta.SortManager.controller;

import com.sparta.SortManager.model.BubbleSort;
import com.sparta.SortManager.model.InsertionSort;
import com.sparta.SortManager.model.MergeSort;
import com.sparta.SortManager.model.Sorter;

public class SortManager{
    private Sorter sorter;
//    log files can be used for normal operations
//    can also be used to record errors
public SortManager(String sorterName){
        switch(sorterName){
            case "bubble": case "bubble sort":
                sorter = new BubbleSort();
            case "insertion": case "insertion sort":
                sorter = new InsertionSort();
            case "merge": case"merge sort":
                sorter = new MergeSort();
            default:
                System.out.println("Invalid name, defaulting to bubble sort.\nsetSorter() is available.");
                sorter = new BubbleSort();
        }
    }
    SortManager(){
        this("bubble");
    }

    public String getSorterName(){
        return sorter.getClass().getSimpleName();
    }

    public void setSorter (String sorterName){
        switch(sorterName){
            case "bubble": case "bubble sort":
                sorter = new BubbleSort();
            case "merge": case "merge sort":
                sorter = new MergeSort();
                //if invalid name entered then defaults to bubble sort
            default:
                System.out.println("Invalid name, defaulting to bubble sort.\n setSorter() is available.");
                sorter = new BubbleSort();
        }
    }

    public int[] sort(int[] inputArray){
//        Scanner scanner = new Scanner(System.in);
        return sorter.sortArray(inputArray);
    }
}
