package com.vinod.gof.com.vinod.gof.abstractfactory;

public class DbDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving department to database");
    }
}
