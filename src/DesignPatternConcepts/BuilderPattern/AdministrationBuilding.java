package DesignPatternConcepts.BuilderPattern;

public class AdministrationBuilding {
    public static void main(String[] args) {

        Department department
                = new DepartmentBuilder().setDepartmentName("Institute of Information Technology").setDepartmentBuildingName("IIT Building").setDepartmentAddress("Shawrawardi Road, Dhaka-1229").setTotalClassNumber("9").setDepartmentDegreeName("BSSE").getDepartmentDetails();


        System.out.println(department);

    }
}
