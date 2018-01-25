package com.jjwtan.visitor;

import com.jjwtan.visitor.visitable.Liquor;
import com.jjwtan.visitor.visitable.Necessity;
import com.jjwtan.visitor.visitable.Tobacco;
import com.jjwtan.visitor.visitor.TaxHolidayVisitor;
import com.jjwtan.visitor.visitor.TaxVisitor;

import java.math.BigDecimal;

/**
 * Created by Ran on 25/1/2018.
 */
public class CalculateTax {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Necessity milk = new Necessity(new BigDecimal(3.25));
        Liquor vodka = new Liquor(new BigDecimal(36.80));
        Tobacco cigars = new Tobacco(new BigDecimal(68.20));

        System.out.println("\nNORMAL TAX VISITOR");
        System.out.println(milk.accept(taxVisitor));
        System.out.println(vodka.accept(taxVisitor));
        System.out.println(cigars.accept(taxVisitor));

        System.out.println("\nTAX HOLIDAY VISITOR");
        System.out.println(milk.accept(taxHolidayVisitor));
        System.out.println(vodka.accept(taxHolidayVisitor));
        System.out.println(cigars.accept(taxHolidayVisitor));


    }
}
