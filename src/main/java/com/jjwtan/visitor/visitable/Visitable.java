package com.jjwtan.visitor.visitable;

import com.jjwtan.visitor.visitor.Visitor;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public interface Visitable {
    BigDecimal accept(Visitor visitor);
}
