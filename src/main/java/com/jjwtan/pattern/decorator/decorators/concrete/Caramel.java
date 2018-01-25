package com.jjwtan.pattern.decorator.decorators.concrete;

import com.jjwtan.pattern.decorator.component.Beverage;
import com.jjwtan.pattern.decorator.decorators.AddOnDecorator;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public class Caramel extends AddOnDecorator {
    private Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    public BigDecimal cost() {
        return this.beverage.cost().add(new BigDecimal(1.2)).setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
