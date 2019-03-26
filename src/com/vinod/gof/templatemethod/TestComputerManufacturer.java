package com.vinod.gof.templatemethod;

public class TestComputerManufacturer {
    public static void main(String[] args) {
        ComputerManufacturer computerManufacturer = new DesktopManufacturer();
        computerManufacturer.buildComputer();
/*        computerManufacturer.addHardDisk();
        computerManufacturer.addRAAM();
        computerManufacturer.addKeyboard();*/

        ComputerManufacturer computerManufacturer1 = new LaptopManufacturer();
        computerManufacturer1.buildComputer();
/*        computerManufacturer1.addHardDisk();
        computerManufacturer1.addRAAM();
        computerManufacturer1.addKeyboard();*/
    }
}
