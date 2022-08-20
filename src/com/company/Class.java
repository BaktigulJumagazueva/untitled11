package com.company;

public class Class {
    private int number;
    private String soz;
    private int massiv[];
    public Class (int number, String soz, int ...massiv){
        this.number=number;
        this.soz=soz;
        this.massiv=massiv;
    }
    public int setNumber(){
        return number;
    }
    public String setSoz(){
        return soz;
    }
    public int[] setMassiv(){
        return massiv;
    }


}
