package DesignPatternConcepts.BuilderPattern;

public class StudentWebDTO implements UserDTO {

    private String name;

    private String address;

    private String session;

    public StudentWebDTO(String name, String address, String session) {
        this.name = name;
        this.address = address;
        this.session = session;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSession() {
        return session;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + session + "\naddress=" + address ;
    }


}