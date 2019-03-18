package com.vinod.gof.com.vinod.gof.abstractfactory;

public class DaoAbstractFactoryProducer {

    public static DaoAbstractFactory produceFactory(String factoryType){
        DaoAbstractFactory daoAbstractFactory = null;
        if(factoryType.equals("xml")){
            daoAbstractFactory = new XMLDaoFactory();

        } else if(factoryType.equals("db")){
            daoAbstractFactory = new DbDaoFactory();

        }
        return daoAbstractFactory;
    }
}
