package ObjectCreator;

public class User {
    private String name;
    private String email;
    private String country;

    public User() {
    }
}

class UserDetails {

    public static void main(String[] args) {
        User[] users = new User[50];
        System.out.println("[");
        int min = 1;
        int max = 5;
        for (User user : users) {
            user = new User();

            String userData;
            userData = String.valueOf(user);

            int initial = userData.length() - 7;
            String reviewerID = "";
            for (int i = initial; i < userData.length(); i++) {
                reviewerID = reviewerID + userData.charAt(i);
            }

            System.out.print("{ ");

            System.out.print("\"");
            System.out.print("reviewerID");
            System.out.print("\" ");

            System.out.print(": ");

            System.out.print("\"");
            System.out.print(reviewerID);
            System.out.println("\" ,");

            System.out.print(" \"");
            System.out.print("rating");
            System.out.print("\" ");
            System.out.print(": ");

            int b = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(b);

            System.out.println(" }, ");

        }
        System.out.println("]");

    }

}
