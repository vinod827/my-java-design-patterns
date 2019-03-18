package com.vinod.gof.com.vinod.gof.abstractfactory;

public class TestDaoAbstractFactoryProducer {
    public static void main(String[] args) {
        DaoAbstractFactory daoAbstractFactory = DaoAbstractFactoryProducer.produceFactory("db");
        Dao dao = daoAbstractFactory.createDao("emp");
        dao.save();
    }
}
