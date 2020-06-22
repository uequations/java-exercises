package com.uequations.design;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesignPattern implements Cloneable {

    private List<String> someList;

    public PrototypeDesignPattern() {
        someList = new ArrayList<String>();
    }

    public PrototypeDesignPattern(List<String> list) {
        this.someList = list;
    }

    public List<String> getSomeList() {
        return someList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getSomeList()) {
            temp.add(s);
        }

        return new PrototypeDesignPattern(temp);
    }
}
