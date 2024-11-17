package com;

public class HealthProfessional {
    public int ID;
    public String name;
    public int age;//Chinese herbal medicine, Chinese patent medicine, Chinese and Western patent medicine, antibiotics,

    // The default constructor
    HealthProfessional(){}

    // The second constructor initializes all of the instance variables
    HealthProfessional(int ID,String name,int age){
        this.ID = ID;
        this.name = name;
        this.age = age;
        System.out.println(name);
    }

    // Print out all of the instance variables
    public void PrintlnHealthProfessional(){
        HealthProfessional myParam = new HealthProfessional(1,"Doctor",25);
        System.out.println("instance1--HealthProfessional ID: " + myParam.ID);
        System.out.println("instance2--HealthProfessional name: " + myParam.name);
        System.out.println("instance3--HealthProfessional age;: " + myParam.age);
    }


}
