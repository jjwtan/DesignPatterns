package com.jjwtan.pattern.decorator;

/**
 * Created by jjwtan on 25/1/2018.
 */
public class OrderDrink {
    public static void main(String[] args) {

        Beverage drink = new Cream(new Caramel(new Cream(new Espresso())));
        System.out.println(drink.cost());
    }
}
