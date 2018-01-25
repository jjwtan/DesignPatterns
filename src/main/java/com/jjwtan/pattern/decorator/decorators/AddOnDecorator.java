package com.jjwtan.pattern.decorator.decorators;

import com.jjwtan.pattern.decorator.component.Beverage;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public abstract class AddOnDecorator extends Beverage {
    public abstract BigDecimal cost();
}
