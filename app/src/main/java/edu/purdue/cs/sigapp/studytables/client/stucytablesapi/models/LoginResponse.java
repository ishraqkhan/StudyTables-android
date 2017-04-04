package edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models;

/**
 * Created by dmtsc on 4/4/2017.
 */

public class LoginResponse {
    boolean success;
    String message;
    String token;

    public LoginResponse(boolean success, String message, String token) {
        this.success = success;
        this.message = message;
        this.token = token;
    }

    public static LoginResponse success() {
        return new LoginResponse(true, "You have been logged in", "fake_token_string_123");
    }
}
