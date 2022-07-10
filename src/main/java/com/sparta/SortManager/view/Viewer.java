package com.sparta.SortManager.view;

import com.sparta.SortManager.LoggingMain;

import java.util.Arrays;
import java.util.Scanner;

public class Viewer {
    Scanner scanner = new Scanner(System.in);
    public String getMainChoice(){
        boolean gotChoice = false;
        String userInput = "";
        while(true){
            System.out.println("What would you like?\n1. Sort random array.\n2. Merge two sorted arrays.");
            userInput = scanner.nextLine().trim();
            switch(userInput){
                case "1": case "2": case "3":
                    return userInput;
                default:
                    LoggingMain.logger.info("Invalid choice in main");
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
    public String getSortingPreference(){
        int tries = 0;
        while(tries++ < 3){
            System.out.println("What type of sorting would you like? (bubble/merge/binary)");
            String userChoice = scanner.nextLine().toLowerCase().trim();
                switch (userChoice){
                case"bubble": case "bubble sort":case "bubblesort": case "bubble-sort":
                    return "bubble";
                case "merge":case "merge sort":case "mergesort": case "merge-sort":
                    return "merge";
                case "binary": case "binary tree": case "binary-tree":
                    return "binary";
                default:
                    LoggingMain.logger.info("invalid entry in getSortingPreference\n");
                    System.out.println("invalid choice, please try again\n");
                    break;
            }
        }
        LoggingMain.logger.warn("Three invalid entries in getSortingPreference");
        System.out.println("Defaulting to bubble sort\n");
        return "bubble";
    }
    public String getTimeString(Long t){
        if ( t < 1000)
            return t + " ns";
        else if( t < 100000000)
            return  t/1000000.0 + " ms";
        else
            return t/1000000000.0 + " seconds";
    }
    public void printTimeTaken(Long t){
        System.out.println("Sorting complete, avg. time taken: " + getTimeString(t));
    }
    public int getArrayLength(){
        int tries = 0;
        while (tries++ < 3){
            System.out.println("Generating randomly, how many elements would you like to use?");
            try{
                int userInput = Integer.parseInt(scanner.nextLine().trim());
                if (userInput>0)
                    return userInput;
                else
                    throw new NotNaturalException("Not a natural number");
            } catch(NotNaturalException e) {
                LoggingMain.logger.info("Natural number exception from getArrayLength\n" + e);
                System.out.println("Only natural numbers accepted\n");
                continue;
            } catch(Exception e){
                LoggingMain.logger.debug("Exception when getting user input for array length\n" + e);
                continue;
            }
        }
        System.out.println("\nAuto generating 100 elements");
        return 100;
    }
    public void printList(int[] intArray, String msg){
        System.out.println(msg + "\n" + Arrays.toString(intArray) + "\n");
    }
    public boolean userWantsToCompare(){
        System.out.println("\n Would you like to compare with another algorithm? (y/n)");
        String userChoice = scanner.nextLine().toLowerCase();
        switch (userChoice){
            case "yes", "y", "ye", "yeah":
                return true;
            default:
                return false;
        }
    }
    public String getComparisonChoice(String current){
        while (true){
            System.out.println("Which algorithm would you like to use?(bubble/binary/merge)");
            String userChoice = scanner.nextLine().trim();
            if (userChoice == current){
                System.out.println("You cannot compare with the same algorithm");
                LoggingMain.logger.warn("Comparison with same algorithm");
            }
            switch (userChoice){
                case"bubble": case "bubble sort":case "bubblesort": case "bubble-sort":
                    return "bubble";
                case "merge":case "merge sort":case "mergesort": case "merge-sort":
                    return "merge";
                case "binary": case "binary tree": case "binary-tree":
                    return "binary";
                }
            System.out.println("Invalid choice please try again");
        }
}
    public void printComparisonResult(Long t1, Long t2){
        if (t1 < t2){
            System.out.println("The first sorter was faster, it took " + getTimeString(t2-t1) + " less to complete.");
        } else if (t2 < t1){
            System.out.println("The second sorter was faster, it took  " + getTimeString(t1 - t2) + " less to complete");
        } else{
            System.out.println("There was no difference");
        }
    }
}
