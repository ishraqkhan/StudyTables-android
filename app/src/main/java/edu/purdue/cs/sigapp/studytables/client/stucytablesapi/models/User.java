package edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models;

/**
 * Created by dmtsc on 4/4/2017.
 */

public class User {
    String username;
    String name;
    String email;
    boolean isVerified;
    String phoneNumber;

    public User(String username, String name, String email, boolean isVerified, String phoneNumber) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.isVerified = isVerified;
        this.phoneNumber = phoneNumber;
    }

    public static User randomUser() {
        return new User("myusername", "Chuck Norris", "email@example.com", true, "555-5555");
    }
    //events.
}
