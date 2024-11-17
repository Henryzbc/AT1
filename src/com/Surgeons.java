package com;

import java.util.ArrayList;
import java.util.List;

public class Surgeons extends HealthProfessional{
    public String workingPlace;// Outpatient Room  or Operating Room
    public String tool;//scalpel
    public List<Surgeons> SurgeonsList = new ArrayList<>();

    @Override
    public String toString() {
        return "ID:" + ID +", name:"+name +", age:"+ age +", workingPlace:"+ workingPlace +", tool:"+ tool;
    }

    public Surgeons(){}

    public Surgeons(int ID,String name,int age, String workingPlace, String tool){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.workingPlace = workingPlace;
        this.tool = tool;
    }

    public void createSurgeonsList(Surgeons param) {
        this.SurgeonsList.add(param);
    }

    // Print out all of the instance variables
    public void PrintlnSurgeons(){
        System.out.println("The Surgeons details are: " + "ID:" + ID +" ,name:"+ name +" ,drug:"+ age +" ,workingPlace:"+ workingPlace+" ,tool:"+ tool);
    }
}
