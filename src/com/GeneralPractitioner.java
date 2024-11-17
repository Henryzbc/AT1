package com;

import java.util.ArrayList;
import java.util.List;

public class GeneralPractitioner extends HealthProfessional{
    public String workingPlace;// Outpatient Room  or Operating Room
    public List<GeneralPractitioner> GeneralPractitionerArrayList = new ArrayList<>();
    @Override
    public String toString() {
        return "ID:" + ID +", name:"+name +", age:"+ age +", workingPlace:"+ workingPlace;
    }

    public GeneralPractitioner(){
    }
    public GeneralPractitioner(int ID,String name,int age, String workingPlace){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.workingPlace = workingPlace;
    }

    public void createGeneralPractitioner(GeneralPractitioner param) {
        this.GeneralPractitionerArrayList.add(param);
    }

    // Print out all of the instance variables
    public void PrintlnGeneralPractitioner(int num){
        System.out.println("The General Practitioner details are: " + "ID:" + ID +", name:"+ name +", age:"+ age +", workingPlace:"+ workingPlace);
    }

}
