package DesignPatternConcepts.BuilderPattern;

public class AdministrationBuilding {
    public static void main(String[] args) {

        Department softwareEngineering
                = new DepartmentBuilder().setDepartmentName("Information Technology").setDepartmentBuildingName("Computer Centre").setDepartmentAddress("Mokaram Educational Area, University of Dhaka, Dhaka -1000").setTotalClassNumber("5").setDepartmentDegreeName("BIT").getDepartmentDetails();
        System.out.println(softwareEngineering.toString());


        System.out.println(softwareEngineering.toString());

    }
}
