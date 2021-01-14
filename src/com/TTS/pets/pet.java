package com.TTS.pets;

public class pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public pet(){
        name= "default name";
        age= 0;
        location = "Location";
        type = "type";
    }

    public pet(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;

    }

    public pet(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName(){
        return name;

    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}
