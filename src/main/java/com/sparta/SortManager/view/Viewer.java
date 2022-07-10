package com.sparta.SortManager.view;

import org.apache.logging.log4j.core.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class Viewer implements View {
    Scanner scanner = new Scanner(System.in);
//    Logger logger = new Logger("my logger");
    public String getSortingPreference(){
        Boolean gotInput = false;
        String userChoice;
        System.out.println("What type of sorting would you like? (bubble)");
        userChoice = scanner.nextLine().toLowerCase();
//        switch (userChoice){
//            case"bubble":case "bubble sort":case "bubblesort":
//                userChoice = "bubble";
//                gotInput = true;
//            case "mergesort":case "merge sort":case "merge":
//                userChoice = "merge";
//                gotInput = true;
//            default:
//                userChoice
//        }
        return userChoice;

    }
    public int getArrayLength(){
        System.out.println("Generating random array, how many elements would you like to use?");
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch(Exception e){
            e.printStackTrace();

            return -1;
        }
    }
    public void printList(int[] intArray){
        System.out.println(Arrays.toString(intArray));
    }
}
