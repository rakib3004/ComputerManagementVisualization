package DesignPatternConcepts.BuilderPattern;


import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String fname) ;

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withDepartment(Department department);

    UserDTO build();

    UserDTO getUserDTO();
}