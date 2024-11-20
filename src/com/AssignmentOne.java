package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssignmentOne {
    public List<Appointment> ArrayList = new ArrayList<>();

    public void createAppointment(Appointment param) {
        if(param.patientName.isEmpty() || param.patientPhone.isEmpty() || param.patientType.isEmpty()
                || param.preferredTime.isEmpty() || param.selectedDoctor.isEmpty()){
            System.out.println("Incomplete information");
        } else {
            this.ArrayList.add(param);
        }
    }

    //If there are no existing appointments, print a message to indicate this.
    public void printExistingAppointments() {
        if(this.ArrayList.isEmpty()){
            System.out.println("no existing appointments !!");
        } else {
            for(int i=0;i<this.ArrayList.size();i++)
            {
                System.out.println("Appointments " + (i+1) + ": " + this.ArrayList.get(i));
            }
        }
    }

    //cancel a booking
    public void cancelBooking(String phone) {
        if(this.useList(this.ArrayList, phone) != null){
            this.ArrayList.remove(this.useList(this.ArrayList, phone));
            System.out.println("cancelBooking success !!");
            System.out.println("");
        } else {
            System.out.println("phone is not found !!");
            System.out.println("");
        }
    }

    public static Object useList(List<Appointment> arr, String targetValue) {
        for(Appointment obj: arr){
            if(obj.patientPhone.equals(targetValue)){
                return obj;
            }
        }
        return null;
    }


    public static void main(String[] args){
        // Part 3 – Using classes and objects
        // create  GeneralPractitioner
        GeneralPractitioner myGeneralPractitioner= new GeneralPractitioner();
        //create GeneralPractitioner 1
        GeneralPractitioner GeneralPractitioner1= new GeneralPractitioner(101,"Mr Wang",30, "Outpatient Room");
        myGeneralPractitioner.createGeneralPractitioner(GeneralPractitioner1);
        //create GeneralPractitioner 2
        GeneralPractitioner GeneralPractitioner2= new GeneralPractitioner(102,"Mr Li",29, "Outpatient Room");
        myGeneralPractitioner.createGeneralPractitioner(GeneralPractitioner2);
        //create GeneralPractitioner 3
        GeneralPractitioner GeneralPractitioner3= new GeneralPractitioner(103,"Mr Zhao",40, "Outpatient Room");
        myGeneralPractitioner.createGeneralPractitioner(GeneralPractitioner3);
        // println GeneralPractitioner List
        for(int i=0;i<myGeneralPractitioner.GeneralPractitionerArrayList.size();i++)
        {
            System.out.println("The General Practitioner " + (i+1) + " details are: " + myGeneralPractitioner.GeneralPractitionerArrayList.get(i));
        }
        // newline
        System.out.println("");

        // create  Surgeons
        Surgeons mySurgeons= new Surgeons();
        //create Surgeons 1
        Surgeons Surgeons1= new Surgeons(201,"Mr Han",22, "Operating Room", "scalpel");
        mySurgeons.createSurgeonsList(Surgeons1);
        //create Surgeons 2
        Surgeons Surgeons2= new Surgeons(202,"Mr Liu",44, "Operating Room","scalpel");
        mySurgeons.createSurgeonsList(Surgeons2);
        // println Surgeons List
        for(int i=0;i<mySurgeons.SurgeonsList.size();i++)
        {
            System.out.println("The Surgeons " + (i+1) + " details are: " + mySurgeons.SurgeonsList.get(i));
        }
        // newline
        System.out.println("");


        //Part 5 – Collection of appointments
        AssignmentOne myAssignmentOne= new AssignmentOne();
        //create Appointment 1
        Appointment Appointment1 = new Appointment("Bob","13011112222", "heat", "08:00", "Mr Wang");
        myAssignmentOne.createAppointment(Appointment1);
        //create Appointment 2
        Appointment Appointment2 = new Appointment("Tom","13033334444", "Leg pain", "10:00", "Mr Wang");
        myAssignmentOne.createAppointment(Appointment2);
        //create Appointment 3
        Appointment Appointment3 = new Appointment("Han","15711112222", "catagma", "8:00", "Mr Liu");
        myAssignmentOne.createAppointment(Appointment3);
        //create Appointment 4
        Appointment Appointment4 = new Appointment("XiaoHong","15700001234", "Leg pain", "14:30", "Mr Han");
        myAssignmentOne.createAppointment(Appointment4);
        // print Appointments first
        myAssignmentOne.printExistingAppointments();
        // cancelBooking
        myAssignmentOne.cancelBooking("13011112222");
        // print Appointments second
        myAssignmentOne.printExistingAppointments();
    }
}
