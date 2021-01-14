package com.TTS.pets;

public class Shirts {

    private String color;
    private char size;
    private String material;

    public static void putOn(){
        System.out.println("Shirt is on");
    }

    public static void takeOff(){
        System.out.println("Shirt is off");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public char getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(char size) {
        this.size = size;
    }

}
