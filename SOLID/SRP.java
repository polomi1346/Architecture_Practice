package SOLID;

import java.io.FileWriter;
import java.io.IOException;

public class SRP {

    // Class responsible only for user data
    public static class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }

    // Class responsible for saving user data to a file
    public static class UserPersistence {
        public void saveToFile(User user) {
            try (FileWriter fileWriter = new FileWriter(user.getName() + ".txt")) {
                fileWriter.write("Name: " + user.getName() + "\n");
                fileWriter.write("Email: " + user.getEmail() + "\n");
                System.out.println("User data saved successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        User user = new User("Clemens", "clemens@company.com");
        UserPersistence persistence = new UserPersistence();
        persistence.saveToFile(user);
    }
}
