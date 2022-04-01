package ObjectCreator;

public class User {
    private String name;
    private String email;
    private String country;

    public User() {
    }
}

class UserDetails{

    public static void main(String[] args) {
        User [] users = new User[50];
        for (User user : users){
            user = new User();
            String [] primaryUserData = new String[3];
            String [] secondaryUserData = new String[3];
            String userData, primaryUserRootData, secondaryUserRootData;
            userData=String.valueOf(user);
            primaryUserData = userData.split(".");


            primaryUserRootData=primaryUserData[1];
            secondaryUserData = primaryUserRootData.split("@");

            secondaryUserRootData=secondaryUserData[1];
            System.out.println(secondaryUserRootData);
        }

    }


}
