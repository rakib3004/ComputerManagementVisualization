package DesignPatternConcepts.BuilderPattern;

public class DepartmentBuilder {

    private String departmentName;

    private String departmentBuildingName;

    private String departmentAddress;

    private String departmentDegreeName;

    private String totalClassNumber;

    public DepartmentBuilder setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;

    }

    public DepartmentBuilder setDepartmentBuildingName(String departmentBuildingName) {
        this.departmentBuildingName = departmentBuildingName;
        return this;

    }

    public DepartmentBuilder setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
        return this;

    }

    public DepartmentBuilder setDepartmentDegreeName(String departmentDegreeName) {
        this.departmentDegreeName = departmentDegreeName;
        return this;

    }

    public DepartmentBuilder setTotalClassNumber(String totalClassNumber) {
        this.totalClassNumber = totalClassNumber;
        return this;

    }

    public Department getDepartmentDetails() {
        return new Department(departmentName, departmentBuildingName,
                departmentAddress, departmentDegreeName, totalClassNumber);
    }
}
