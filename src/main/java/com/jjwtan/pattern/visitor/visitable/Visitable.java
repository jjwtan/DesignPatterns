package com.jjwtan.pattern.visitor.visitable;

import com.jjwtan.pattern.visitor.visitor.Visitor;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public interface Visitable {
    BigDecimal accept(Visitor visitor);
}
