package com.bilal.carpetcostcalculator;

public class Floor {
    private int length, width;

    public Floor(int length, int width) {
        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }

    public double getArea() {
        return length * width;
    }

}
