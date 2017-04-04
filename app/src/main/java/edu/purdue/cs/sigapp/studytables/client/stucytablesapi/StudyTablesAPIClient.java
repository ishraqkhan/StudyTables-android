package edu.purdue.cs.sigapp.studytables.client.stucytablesapi;

import java.util.List;

import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.Course;
import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.Event;
import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.LoginResponse;
import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by dmtsc on 2/23/2017.
 */

public interface StudyTablesAPIClient {

    @POST("/login")
    Call<LoginResponse> login(@Body String username, @Body String password);

    @GET("/users/{id}")
    Call<User> getUserById(@Path("id") String userid);
    @GET("/users/{username}")
    Call<User> getUserByUserName(@Path("username") String username);
    @GET("/users/me")
    Call<User> getSelf();
    @POST("/users")
    Call<User> makeUser(@Body User newUser);

    @GET("/courses")
    Call<List<Course>> getCourses();
    @GET("/courses/{crn}")
    Call<Course> getCourse(@Path("crn") String crn);

    @GET("/events")
    Call<List<Event>> getEvents();
    @POST("/events")
    Call<Event> createEvent(Event event);

    //skipping search by classname.

    @PUT("/events/{id}/join")
    Call<Event> joinEvent(@Path("id") String eventId);
    @PUT("/events/{id}/leave")
    Call<Event> leaveEvent(@Path("id") String eventId);
}
