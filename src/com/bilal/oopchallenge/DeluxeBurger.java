package com.bilal.oopchallenge;

public class DeluxeBurger extends Hamburger{

    private double chipsPrice = 2.75;
    private double drinksPrice = 1.81;
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White roll");
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    public double itemizeHamburger() {
        System.out.println("Added Chips for an extra " + chipsPrice);
        System.out.println("Added Drink for an extra " + drinksPrice);
        return super.itemizeHamburger() + this.chipsPrice + this.drinksPrice;
    }
}
