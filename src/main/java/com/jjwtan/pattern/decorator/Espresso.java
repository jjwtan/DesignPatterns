package com.jjwtan.pattern.decorator;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public class Espresso extends Beverage {
    public BigDecimal cost() {
        return new BigDecimal(3.6);
    }
}
