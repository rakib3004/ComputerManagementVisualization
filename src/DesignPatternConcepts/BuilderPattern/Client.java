package DesignPatternConcepts.BuilderPattern;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        //Client has to provide director with concrete builder
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }


    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getDepartment())
                .withBirthday(user.getBirthday())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1979, 07, 6));
        user.setFirstName("Pedram");
        user.setLastName("Karevan");
        Department department = new Department();
        department.setDepartmentAddress("100");
        department.setDepartmentBuildingName("State Street");
        department.setTotalClassNumber("Tehran");
        department.setDepartmentDegreeName("Iran");
        department.setDepartmentBuildingName("2375");
        user.setDepartment(department);
        return user;
    }
}