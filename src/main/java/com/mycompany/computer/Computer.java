package com.mycompany.computer;

public class Computer {

    public Computer() {

    }

    public void setCom1() {
        CPU cpu1;
        cpu1 = new CPU("intel", "Core i9");
        Moniter moniter1 = new Moniter("21 inch");
        RAM ram1 = new RAM();
        ram1.installRAM("128 GB");
        Keybord keybord1 = new Keybord();
        keybord1.chooseButtonColor("Red");
        Harddisk harddisk1 = new Harddisk("Seagate");
        harddisk1.setCapacity("1TB");
        System.out.println("Computer 1");
        System.out.println("CPU : " + cpu1);
        System.out.println("Moniter size : " + moniter1);
        System.out.println("RAM : " + ram1.ramSize);
        System.out.println("Keybord color : " + keybord1);
        System.out.println("Harddisk brand : " + harddisk1);
        System.out.println("Harddisk capacity : " + harddisk1.capacity);
    }

    public void setCom2() {
        CPU cpu2;
        cpu2 = new CPU("AMD", "amd3");
        Moniter moniter2 = new Moniter("30 inch");
        RAM ram2 = new RAM();
        ram2.installRAM("64 GB");
        Keybord keybord2 = new Keybord();
        keybord2.chooseButtonColor("Blue");
        Harddisk harddisk2 = new Harddisk("Western");
        harddisk2.setCapacity("500 GB");
        System.out.println("\nComputer 2");
        System.out.println("CPU : " + cpu2);
        System.out.println("Moniter size : " + moniter2);
        System.out.println("RAM : " + ram2.ramSize);
        System.out.println("Keybord color : " + keybord2);
        System.out.println("Harddisk brand : " + harddisk2);
        System.out.println("Harddisk capacity : " + harddisk2.capacity);
    }
}
