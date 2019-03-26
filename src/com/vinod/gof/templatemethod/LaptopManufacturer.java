package com.vinod.gof.templatemethod;

public class LaptopManufacturer extends ComputerManufacturer {
    @Override
    public void addHardDisk() {
        System.out.println("Add hard disk to Laptop");
    }

    @Override
    public void addRAAM() {
        System.out.println("Add RAM to Laptop");
    }

    @Override
    public void addKeyboard() {
        System.out.println("Add keyboard to Laptop");
    }
}
