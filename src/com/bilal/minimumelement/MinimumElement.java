package com.bilal.minimumelement;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner sc = new Scanner(System.in);

    public int readInteger() {
        return sc.nextInt();
    }

    public int[] readElements(int noOfElements) {
        int[] array = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

