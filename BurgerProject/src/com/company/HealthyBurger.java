package com.company;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    //generate the constructor to the parameter in the basic class
    // delete the healthy1 and the name just keeping the meat and the price

    public HealthyBurger(String meat, double price) {
        super("healthy", meat, price, "Brown rye");

    }
    // generate the methods for the healthy 2 types
    public void addHealthAddition1 ( String name , double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2 ( String name , double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
    // add the method to be get the total price
    // we have to make override to itemizhamburger

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if ( this.healthyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println(" Added" + this.healthyExtra1Name + " for a extra "+ this.healthyExtra1Price);
        }

        if ( this.healthyExtra2Name != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println(" Added" + this.healthyExtra2Name + " for a extra "+ this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
