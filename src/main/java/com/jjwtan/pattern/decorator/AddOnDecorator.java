package com.jjwtan.pattern.decorator;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public abstract class AddOnDecorator extends Beverage{
    public abstract BigDecimal cost();
}
