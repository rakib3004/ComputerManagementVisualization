package DesignPatternConcepts.BuilderPattern;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Main {

    public static void main(String[] args) {
        Student student = createUser();
        UserDTOBuilder builder = new StudentWebDTOBuilder();
        //Client has to provide director with concrete builder
        UserDTO dto = directBuild(builder, student);
        System.out.println(dto);
    }


    private static UserDTO directBuild(UserDTOBuilder builder, Student student) {
        return builder.withFirstName(student.getFirstName()).withLastName(student.getLastName())
                .withDepartment(student.setDepartment();)
                .withBirthday(student.getDepartment())
                .build();
    }

    public static Student createUser() {
        Student student = new Student();
        student.setBirthday(LocalDate.of(1979, 07, 6));
        student.setFirstName("Pedram");
        student.setLastName("Karevan");
        Department department = new Department();
        department.setDepartmentAddress("100");
        department.setDepartmentBuildingName("State Street");
        department.setTotalClassNumber("Tehran");
        department.setDepartmentDegreeName("Iran");
        department.setDepartmentBuildingName("2375");
        student.setDepartment(department);
        return student;
    }
}