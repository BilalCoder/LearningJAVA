package com.bilal.oopchallenge;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String addHealthyAddition1Name, double addHealthyAddition1Price) {
        this.healthyExtra1Name = addHealthyAddition1Name;
        this.healthyExtra1Price  = addHealthyAddition1Price;
        System.out.println("Added " + addHealthyAddition1Name + " for an extra " + addHealthyAddition1Price);
    }

    public void addHealthyAddition2(String addHealthyAddition2Name, double addHealthyAddition2Price) {
        this.healthyExtra2Name = addHealthyAddition2Name;
        this.healthyExtra2Price  = addHealthyAddition2Price;
        System.out.println("Added " + addHealthyAddition2Name + " for an extra " + addHealthyAddition2Price);
    }

    public double itemizeHamburger() {
        return this.healthyExtra1Price + this.healthyExtra2Price + super.itemizeHamburger();
    }

}
