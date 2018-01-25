package com.jjwtan.pattern.decorator.component.concrete;

import com.jjwtan.pattern.decorator.component.Beverage;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public class Espresso extends Beverage {
    public BigDecimal cost() {
        return new BigDecimal(3.6);
    }
}
