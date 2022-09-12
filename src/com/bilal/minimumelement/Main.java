package com.bilal.minimumelement;

public class Main {
    public static void main(String[] args) {
        MinimumElement minimumElement = new MinimumElement();
        int numberOfElements = minimumElement.readInteger();
        int[] array = minimumElement.readElements(numberOfElements);
        System.out.println("Minimum number is: " + minimumElement.findMin(array));
    }
}
