package com.company;
/*
 explain the app :
-this application is to help the fictitious company called "bills burger" to manage
their process of selling hamburgers.
-this app will help the bill to select types of burger. some of additional items
to be add to the burger and the pricing.
-we will generate a base hamburger and also add other types of burger that popular
ones in bills store.
- the basic burger has this items ( bread roll type, meat , 4 additional like
  tomato , lettuce , carrot , .. ). the customer can select to be added to the burger.
- each one of these items gets prices . you have to calculate the final price .
- the basic burger has a base price and the additional are separately priced .
- create a hamburger class to deal with all above.
-the constructor should only include the roll type , meat an price ,can also include
  a name of burger or can you use a setter.
 - we have 2 extra varieties of burger to cate for:
    1- healthy burger brown bread + 2 addition items can be added.not more than 6.
    2- deluxe burger come with chips and drinks as additions.but not more are allowed.
  - all 3 classes should have a method that can called anytime to
    show the base price of burger + all additionals , each showing the additional name.
    price and the total price.
    - for the 2 additional classes this may require you to be looking at base for price
    and then adding totals to final price.

 */

public class Main {

    public static void main(String[] args) {

        // make the project to see the result
        Hamburger hamburger = new Hamburger("basic " ,"sausage" ,
                                            3.56 ,"white");

        double price = hamburger.itemizeHamburger(); // return the price.
        // make the additional
        hamburger.addHamburgerAdditional1("tomato" , 0.70);
        hamburger.addHamburgerAdditional2("lettuce" , 0.90);
        hamburger.addHamburgerAdditional3("cheese" , 1.20);
        System.out.println("  ***the total price is : < "+ hamburger.itemizeHamburger() +" $ >") ;

        System.out.println(" *************** ");

        // run the healthy burger
        HealthyBurger healthyBurger = new HealthyBurger("Bacon ", 5.60);
        healthyBurger.addHealthAddition1("eggs" , 0.90);
        healthyBurger.addHealthAddition2( " lentils" , 3.41);
        System.out.println( " Total healthy Price is "+healthyBurger.itemizeHamburger() + " $");

        // call the deluxe burger method
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAdditional1( " should not add this" , 30);
        deluxeBurger.itemizeHamburger();

    }
}
