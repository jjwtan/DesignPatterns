package com.jjwtan.pattern.decorator;

import com.jjwtan.pattern.decorator.component.Beverage;
import com.jjwtan.pattern.decorator.component.concrete.Espresso;
import com.jjwtan.pattern.decorator.component.concrete.Latte;
import com.jjwtan.pattern.decorator.decorators.concrete.Caramel;
import com.jjwtan.pattern.decorator.decorators.concrete.Cream;

/**
 * Created by jjwtan on 25/1/2018.
 */
public class OrderDrink {
    public static void main(String[] args) {

        Beverage caramelDoubleCreamEspresso = new Cream(new Caramel(new Cream(new Espresso())));
        Beverage doubleCaramelLatte = new Caramel(new Caramel(new Latte()));
        System.out.println(caramelDoubleCreamEspresso.cost());
        System.out.println(doubleCaramelLatte.cost());
    }
}
