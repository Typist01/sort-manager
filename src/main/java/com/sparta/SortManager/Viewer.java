package com.sparta.SortManager;

import java.util.Arrays;
import java.util.Scanner;

public class Viewer implements View {
    Scanner scanner = new Scanner(System.in);

    public String getSortingPreference(){
        System.out.println("What type of sorting would you like? (bubble)");
        return scanner.nextLine();
    }

    public String getArrayLength(){
        System.out.println("Generating random array, how many elements would you like to use?");
        try{
            Integer.parseInt(scanner.nextLine());
        } catch(Exception e){

        }
    }

    public void printList(int[] intArray){
        System.out.println(Arrays.toString(intArray));
    }
}
