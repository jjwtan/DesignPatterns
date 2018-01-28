package com.jjwtan.pattern.nullobject;

/**
 * Created by jjwtan on 28/1/2018.
 */
public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
