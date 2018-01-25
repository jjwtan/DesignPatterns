package com.jjwtan.visitor.visitable;

import com.jjwtan.visitor.visitor.Visitor;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public class Necessity implements Visitable {

    BigDecimal price;

    public Necessity(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
