package DesignPatternConcepts.BuilderPattern;


import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String fname) ;

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withSession(String session);

    UserDTOBuilder withDepartment(Department department);

    UserDTO build();

    UserDTO getUserDTO();
}