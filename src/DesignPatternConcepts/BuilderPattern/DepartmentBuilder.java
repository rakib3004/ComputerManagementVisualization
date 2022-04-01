package DesignPatternConcepts.BuilderPattern;

public class DepartmentBuilder {


    private String departmentName;

    private String departmentBuildingName;

    private String departmentAddress;

    private String departmentDegreeName;

    private String totalClassNumber;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentBuildingName(String departmentBuildingName) {
        this.departmentBuildingName = departmentBuildingName;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public void setDepartmentDegreeName(String departmentDegreeName) {
        this.departmentDegreeName = departmentDegreeName;
    }

    public void setTotalClassNumber(String totalClassNumber) {
        this.totalClassNumber = totalClassNumber;
    }
}
