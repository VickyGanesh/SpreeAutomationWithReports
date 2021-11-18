package Encapsulation;

import java.awt.*;
import java.util.ArrayList;

public class CollegeAndStudentDetails {
    private String collegeName ;
    private ArrayList<String> departmentNames;

    public ArrayList<String> getDepartmentNames() {
        return departmentNames;
    }

    public void setDepartmentNames(ArrayList<String> departmentNames) {
        this.departmentNames = departmentNames;
        System.out.println(departmentNames);
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
        System.out.println(collegeName);
    }
    /*void display(String colgName , List<String> dept){
        System.out.println("The college Name is " + colgName)
        System.out.println(dept);;

    }*/


    public static void main(String[] args) {
        CollegeAndStudentDetails  collegeAndStudentDetails = new CollegeAndStudentDetails();
        ArrayList<String> namesOfDepartment = new ArrayList<>();
        namesOfDepartment.add("IT");
        namesOfDepartment.add("CS");
        namesOfDepartment.add("MECH");
        namesOfDepartment.add("ECE");
        namesOfDepartment.add("EEE");
        namesOfDepartment.add("AERO");
        namesOfDepartment.add("AUTO");
        namesOfDepartment.add("EI");

        collegeAndStudentDetails.setCollegeName("PSG");
        collegeAndStudentDetails.setDepartmentNames(namesOfDepartment);
        collegeAndStudentDetails.setCollegeName("KumaraGuru");
        collegeAndStudentDetails.setDepartmentNames(namesOfDepartment);
        collegeAndStudentDetails.setCollegeName("KLN");
        collegeAndStudentDetails.setDepartmentNames(namesOfDepartment);
        collegeAndStudentDetails.setCollegeName("ThiagarajarCE");
        collegeAndStudentDetails.setDepartmentNames(namesOfDepartment);
        collegeAndStudentDetails.setCollegeName("SethuIT");
        collegeAndStudentDetails.setDepartmentNames(namesOfDepartment);






    }
}
