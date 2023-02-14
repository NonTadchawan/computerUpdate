package com.mycompany.computer;

public class CPU {
    private String brand;
    private String model;

    public CPU(String brand,String model){
        this.brand = brand;
        this.model = model;
    }
    public void setCPU(){
    
    }
    @Override
    public String toString(){
        return this.brand+" "+this.model;
    }
   
    
}
