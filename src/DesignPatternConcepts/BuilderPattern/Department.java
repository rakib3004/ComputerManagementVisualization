package DesignPatternConcepts.BuilderPattern;

public class Department {

    private String departmentName;

    private String departmentBuildingName;

    private String departmentAddress;

    private String departmentDegreeName;

    private String totalClassNumber;

    public Department() {
    }

    public Department(String departmentName, String departmentBuildingName, String departmentAddress,
            String departmentDegreeName, String totalClassNumber) {
        this.departmentName = departmentName;
        this.departmentBuildingName = departmentBuildingName;
        this.departmentAddress = departmentAddress;
        this.departmentDegreeName = departmentDegreeName;
        this.totalClassNumber = totalClassNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentBuildingName() {
        return departmentBuildingName;
    }

    public void setDepartmentBuildingName(String departmentBuildingName) {
        this.departmentBuildingName = departmentBuildingName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentDegreeName() {
        return departmentDegreeName;
    }

    public void setDepartmentDegreeName(String departmentDegreeName) {
        this.departmentDegreeName = departmentDegreeName;
    }

    public String getTotalClassNumber() {
        return totalClassNumber;
    }

    public void setTotalClassNumber(String totalClassNumber) {
        this.totalClassNumber = totalClassNumber;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentBuildingName='" + departmentBuildingName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentDegreeName='" + departmentDegreeName + '\'' +
                ", totalClassNumber='" + totalClassNumber + '\'' +
                '}';
    }
}