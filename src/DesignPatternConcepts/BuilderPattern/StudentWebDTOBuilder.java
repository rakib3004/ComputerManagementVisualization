package DesignPatternConcepts.BuilderPattern;



public class StudentWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String session;
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

    public UserDTOBuilder withSession(String session) {
        this.session =session;
        return this;
    }


    public UserDTOBuilder withDepartment(Department department) {
        this.address = department.getDepartmentAddress() +", " + department.getDepartmentAddress()
                +"\n" + department.getTotalClassNumber() +"\n"+department.getDepartmentDegreeName()+" "+department.getDepartmentAddress();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new StudentWebDTO(firstName+ " "+lastName, address, session);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }


}