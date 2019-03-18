package com.vinod.gof.abstractfactory;

import com.vinod.gof.com.vinod.gof.abstractfactory.Dao;
import com.vinod.gof.com.vinod.gof.abstractfactory.DaoAbstractFactory;
import com.vinod.gof.com.vinod.gof.abstractfactory.DaoAbstractFactoryProducer;

public class TestDaoAbstractFactoryProducer {
    public static void main(String[] args) {
        DaoAbstractFactory daoAbstractFactory = DaoAbstractFactoryProducer.produceFactory("db");
        Dao dao = daoAbstractFactory.createDao("emp");
        dao.save();
    }
}
