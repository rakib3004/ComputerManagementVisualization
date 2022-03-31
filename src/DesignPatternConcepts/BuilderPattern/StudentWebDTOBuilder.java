package DesignPatternConcepts.BuilderPattern;


import java.time.LocalDate;
import java.time.Period;

public class StudentWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private StudentWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }


    public UserDTOBuilder withDepartment(Department department) {
        this.address = department.getDepartmentAddress() +", " + department.getDepartmentAddress()
                +"\n" + department.getTotalClassNumber() +"\n"+department.getDepartmentDegreeName()+" "+department.getDepartmentAddress();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new StudentWebDTO(firstName+ " "+lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }


}