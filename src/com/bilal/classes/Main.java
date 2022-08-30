package com.bilal.Classes;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

        Car holden = new Car();
        holden.setModel("carrera");
        System.out.println("Model is " + holden.getModel());
    }
}

