package edu.purdue.cs.sigapp.studytables.client.stucytablesapi;

import java.util.List;

import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.Course;
import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.Event;
import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.LoginResponse;
import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Path;

/**
 *  A mock version of the API that returns statically "random" results.
 *  This does not attempt to persist any information and should not be
 *  used to test anything other than the "async" execution of events.
 *
 *  Callbacks here will be called with success immediately with some sort of "complete"
 *  though useless information. This will be good for getting the API calls down before
 *  the server is fully hosted and also for general display and formatting issues
 *
 *  Feel free to improve the generation of API data in this class.
 */

public class MockStudytablesApiService implements StudyTablesAPIClient {
    @Override
    public Call<LoginResponse> login(@Body String username, @Body String password) {
        return new MockRetrofitCall<>(LoginResponse.success());
    }

    @Override
    public Call<User> getUserById(@Path("id") String userid) {
        return new MockRetrofitCall<>(User.randomUser());
    }

    @Override
    public Call<User> getUserByUserName(@Path("username") String username) {
        return new MockRetrofitCall<>(User.randomUser());
    }

    @Override
    public Call<User> getSelf() {
        return new MockRetrofitCall<>(User.randomUser());
    }

    @Override
    public Call<User> makeUser(@Body User newUser) {
        return new MockRetrofitCall<>(newUser);
    }

    @Override
    public Call<List<Course>> getCourses() {
        return new MockRetrofitCall<>(Course.makeRandomClasses());
    }

    @Override
    public Call<Course> getCourse(@Path("crn") String crn) {
        return new MockRetrofitCall<>(Course.makeRandomClasses().get(0));
    }

    @Override
    public Call<List<Event>> getEvents() {
        return new MockRetrofitCall<>(Event.makeRandomEvents());
    }

    @Override
    public Call<Event> createEvent(Event event) {
        return new MockRetrofitCall<>(event);
    }

    @Override
    public Call<Event> joinEvent(@Path("id") String eventId) {
        return new MockRetrofitCall<>(Event.makeRandomEvents().get(0));
    }

    @Override
    public Call<Event> leaveEvent(@Path("id") String eventId) {
        return new MockRetrofitCall<>(Event.makeRandomEvents().get(0));
    }
}
