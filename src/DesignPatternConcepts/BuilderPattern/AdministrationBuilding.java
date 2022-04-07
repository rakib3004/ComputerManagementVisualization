package DesignPatternConcepts.BuilderPattern;

public class AdministrationBuilding {
    public static void main(String[] args) {

        Department softwareEngineering = new DepartmentBuilder().setDepartmentName("Information Technology")
                .setDepartmentBuildingName("Computer Centre")
                .setDepartmentAddress("IIT Building, Mokaram Area, University of Dhaka, Dhaka -1000")
                .setTotalClassNumber("9").setDepartmentDegreeName("BSSE").getDepartmentDetails();
        System.out.println(softwareEngineering.toString());

    }
}
