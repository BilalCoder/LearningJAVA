package com.bilal.sortedarray;

import java.util.Scanner;

public class SortedArray {

    public int[] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);
        int[] unsortedArray = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter number" + (i + 1) + ": ");
            unsortedArray[i] = sc.nextInt();
        }
        return unsortedArray;
    }

    public void printArray(int[] sortedArray) {
        for(int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }

    public int[] sortIntegers(int[] unsortedArray) {
        int temp = 0;
        for(int i = 0 ; i < unsortedArray.length; i++) {
            for(int j = i + 1 ; j < unsortedArray.length; j++) {
                if(unsortedArray[i] < unsortedArray[j]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        return unsortedArray;
    }

    public static void main(String[] args) {
        SortedArray sa = new SortedArray();
        int[] unsortedArray = sa.getIntegers(5);
        int[] sortedArray = sa.sortIntegers(unsortedArray);
        sa.printArray(sortedArray);
    }
}
