package com.vinod.gof.templatemethod;

public abstract class ComputerManufacturer {

    public void buildComputer(){
        System.out.println("Computer Manufacturer: building the computer");
        addHardDisk();
        addRAAM();
        addKeyboard();
    }

    public abstract void addHardDisk();
    public abstract void addRAAM();
    public abstract void addKeyboard();
}
