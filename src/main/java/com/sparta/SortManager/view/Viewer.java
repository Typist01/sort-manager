package com.sparta.SortManager.view;

import org.apache.logging.log4j.core.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class Viewer {
    Scanner scanner = new Scanner(System.in);
//    Logger logger = new Logger("my logger");

    public String getMainChoice(){
        boolean gotChoice = false;
        String userInput = "";
        while(true){
            System.out.println("What would you like?\n1. Sort random array.\n2. Sort custom array.\n3. Merge two sorted arrays.");
            userInput = scanner.nextLine().trim();
            switch(userInput){
                case "1": case "2": case "3":
                    return userInput;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public String getSortingPreference(){
        System.out.println("What type of sorting would you like? (bubble)");
        String userChoice = scanner.nextLine().toLowerCase().trim();
        switch (userChoice){
            case"bubble": case "bubble sort":case "bubblesort": case "bubble-sort":
                return "bubble";

            case "merge":case "merge sort":case "mergesort": case "merge-sort":
                return "merge";
            default:
                System.out.println("invalid choice, defaulting to bubble");
                return "bubble";
        }
    }
    public void printTimeTaken(double t){
        System.out.println("Sorting complete, time taken: " + t);
    }
    public int getArrayLength(){
        System.out.println("Generating random array, how many elements would you like to use?");
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Not a natural number, auto generating 100 elements");
            return 100;
        }
    }
    public void printList(int[] intArray, String msg){
        System.out.println(msg + "\n" + Arrays.toString(intArray));
    }
}
