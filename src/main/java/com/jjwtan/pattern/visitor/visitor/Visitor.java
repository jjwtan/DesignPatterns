package com.jjwtan.pattern.visitor.visitor;

import com.jjwtan.pattern.visitor.visitable.Liquor;
import com.jjwtan.pattern.visitor.visitable.Necessity;
import com.jjwtan.pattern.visitor.visitable.Tobacco;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public interface Visitor {
    public BigDecimal visit (Liquor liquorItem);
    public BigDecimal visit (Tobacco tobaccoItem);
    public BigDecimal visit (Necessity necessityItem);
}
