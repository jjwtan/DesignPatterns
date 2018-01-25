package com.jjwtan.visitor.visitor;

import com.jjwtan.visitor.visitable.Liquor;
import com.jjwtan.visitor.visitable.Necessity;
import com.jjwtan.visitor.visitable.Tobacco;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public class TaxVisitor implements Visitor{

    public TaxVisitor() {}

    @Override
    public BigDecimal visit(Liquor liquorItem) {
        System.out.println("Liquor item: Price with Tax");
        return liquorItem.getPrice().multiply(new BigDecimal(0.18))
                .add(liquorItem.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal visit(Tobacco tobaccoItem) {
        System.out.println("Liquor item: Price with Tax");
        return tobaccoItem.getPrice().multiply(new BigDecimal(0.3))
                .add(tobaccoItem.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal visit(Necessity necessityItem) {
        System.out.println("Liquor item: Price with Tax");
        return necessityItem.getPrice().multiply(new BigDecimal(0.07))
                .add(necessityItem.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
