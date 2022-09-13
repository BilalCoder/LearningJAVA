package com.bilal.reversearray;

public class Main {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {-1, 4, 0, -3, 0, 7};
        reverseArray.reverse(array1);
        reverseArray.reverse(array2);
    }
}
