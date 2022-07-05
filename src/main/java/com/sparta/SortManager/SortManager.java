package com.sparta.SortManager;


public class SortManager{
    private Sorter sorter;
    SortManager(String sorterName){
        switch(sorterName){
            case "bubble": case "bubble sort":
                sorter = new BubbleSort();
            case "insertion": case "insertion sort":
                sorter = new InsertionSort();
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
            case "insertion": case "insertion sort":
                sorter = new InsertionSort();
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
