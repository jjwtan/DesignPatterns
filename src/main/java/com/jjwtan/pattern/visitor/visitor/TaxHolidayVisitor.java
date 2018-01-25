package com.jjwtan.pattern.visitor.visitor;

import com.jjwtan.pattern.visitor.visitable.Liquor;
import com.jjwtan.pattern.visitor.visitable.Necessity;
import com.jjwtan.pattern.visitor.visitable.Tobacco;

import java.math.BigDecimal;

/**
 * Created by jjwtan on 25/1/2018.
 */
public class TaxHolidayVisitor implements Visitor{

    public TaxHolidayVisitor() {}

    @Override
    public BigDecimal visit(Liquor liquorItem) {
        System.out.println("Liquor item: Price with Tax");
        return liquorItem.getPrice().multiply(new BigDecimal(0.05))
                .add(liquorItem.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal visit(Tobacco tobaccoItem) {
        System.out.println("Liquor item: Price with Tax");
        return tobaccoItem.getPrice().multiply(new BigDecimal(0.1))
                .add(tobaccoItem.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal visit(Necessity necessityItem) {
        System.out.println("Liquor item: Price with Tax");
        return necessityItem.getPrice().multiply(new BigDecimal(0))
                .add(necessityItem.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
