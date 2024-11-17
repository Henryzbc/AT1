package com;

public class Appointment {

    public String patientName;
    public String patientPhone;
    public String patientType;
    public String preferredTime;
    public String selectedDoctor;

    public Appointment() {}

    public Appointment(String patientName,String patientPhone,String patientType,String preferredTime,String selectedDoctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.patientType = patientType;
        this.preferredTime = preferredTime;
        this.selectedDoctor = selectedDoctor;
    }

    @Override
    public String toString() {
        return "patientName:" + patientName +", patientPhone:"+patientPhone +", patientType:"+ patientType +", preferredTime:"+ preferredTime +", selectedDoctor:"+ selectedDoctor;
    }

    // Print out all of the instance variables
    public void PrintlnGeneralPractitioner(){
        Appointment myParam = new Appointment("General Practitioner","Chinese herbal medicine", "Outpatient Room", "Outpatient Room", "Outpatient Room");
        System.out.println("The General Practitioner details are: " + "patientName:" + myParam.patientName +" ,patientPhone:"+ myParam.patientPhone +" ,patientType:"+ myParam.patientType +" ,preferredTime:"+ myParam.preferredTime +" ,selectedDoctor:"+ myParam.selectedDoctor);
    }

}
