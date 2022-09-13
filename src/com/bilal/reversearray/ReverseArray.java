package com.bilal.reversearray;

import java.util.Arrays;

public class ReverseArray {

    public void reverse (int[] array) {
        int temp;
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
