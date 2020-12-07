package com.company;

public class DeluxeBurger extends Hamburger {

    // we do'nt need to create any parapmeters just. delete it
    // make constructors with the deluxe parameters


    public DeluxeBurger() {
        super("Deluxe ", "Sausage & Bacon ", 14.50, " white");

        // for the chips and drink we just add addition1
        super.addHamburgerAdditional1( "chips" , 2.50);
        super.addHamburgerAdditional2(" drink" , 1.80);
    }

    // we could override and add all additionals and say we can not add any thing

    @Override
    public void addHamburgerAdditional1(String name, double price) {
        System.out.println( " xxx can not add items to deluxe burger xxx");
    }

    @Override
    public void addHamburgerAdditional2(String name, double price) {
        System.out.println( " xxx can not add items to deluxe burger xxx");
    }

    @Override
    public void addHamburgerAdditional3(String name, double price) {
        System.out.println( " xxx can not add items to deluxe burger xxx");
    }

    @Override
    public void addHamburgerAdditional4(String name, double price) {
        System.out.println( " xxx can not add items to deluxe burger xxx");
    }
}
