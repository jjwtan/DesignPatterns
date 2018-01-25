package com.jjwtan.pattern.decorator.decorators.concrete;

import com.jjwtan.pattern.decorator.component.Beverage;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public class Cream extends Beverage {
    private Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    public BigDecimal cost() {
        return this.beverage.cost().add(new BigDecimal(0.5)).setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
