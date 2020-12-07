package com.company;

public class Hamburger {

    // generate the variables as we ve explained
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    // generate the additional name price for 4 types
    private String additional1Name;
    private double additional1Price;

    private String additional2Name;
    private double additional2Price;

    private String additional3Name;
    private double additional3Price;

    private String additional4Name;
    private double additional4Price;




    // generate the constructor for all

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    // generate a method to  send the additional name and price

    public void addHamburgerAdditional1(String name , double price ){
        this.additional1Name = name;
        this.additional1Price = price;
    }

    public void addHamburgerAdditional2(String name , double price ){
        this.additional2Name = name;
        this.additional2Price = price;
    }

    public void addHamburgerAdditional3(String name , double price ){
        this.additional3Name = name;
        this.additional3Price = price;
    }

    public void addHamburgerAdditional4(String name , double price ){
        this.additional4Name = name;
        this.additional4Price = price;
    }

    // generate the method to make the price for the basic Hamburger
    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println( this.name + " hamburger" + " on a " + this.breadRollType +
                            "roll" + " price is : " + this.price);

        // check if there is any additional to add to the price
        if (this.additional1Name != null){
            hamburgerPrice += this.additional1Price;
            System.out.println("added "+ this.additional1Name + " for extra " + this.additional1Price);
        }

        if (this.additional2Name != null){
            hamburgerPrice += this.additional2Price;
            System.out.println("added "+ this.additional2Name + " for extra " + this.additional2Price);
        }

        if (this.additional3Name != null){
            hamburgerPrice += this.additional3Price;
            System.out.println("added "+ this.additional3Name + " for extra " + this.additional3Price);
        }

        if (this.additional4Name != null){
            hamburgerPrice += this.additional4Price;
            System.out.println("added "+ this.additional4Name + " for extra " + this.additional4Price);
        }
        return hamburgerPrice;

    }


}

