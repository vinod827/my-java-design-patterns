package com.vinod.gof.templatemethod;

public class DesktopManufacturer extends ComputerManufacturer {
    @Override
    public void addHardDisk() {
        System.out.println("Add hard disk to Desktop");
    }

    @Override
    public void addRAAM() {
        System.out.println("Add RAM to Desktop");
    }

    @Override
    public void addKeyboard() {
        System.out.println("Add keyboard to Desktop");
    }
}
