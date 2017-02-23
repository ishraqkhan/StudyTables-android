package edu.purdue.cs.sigapp.studytables.client;

import edu.purdue.cs.sigapp.studytables.client.model.PurdueBuilding;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueCampus;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueClass;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueCourse;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueInstructor;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueMeeting;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueRoom;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueSection;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueSubject;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueTerm;
import edu.purdue.cs.sigapp.studytables.client.ODataResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by mvieck on 1/18/17.
 */

public interface ApiInterface {
    @GET("Terms")
    Call<ODataResponse<PurdueTerm>> getAllTerms();
    @GET("Subjects")
    Call<ODataResponse<PurdueSubject>> getAllSubjects();
    @GET("Courses")
    Call<ODataResponse<PurdueCourse>> getAllCourses();

    @GET("Courses")
    Call<ODataResponse<PurdueCourse>> getAllCoursesForSubject(@Query("$filter") String filterString);

    @GET("Classes")
    Call<ODataResponse<PurdueClass>> getAllClasses();
    @GET("Sections")
    Call<ODataResponse<PurdueSection>> getAllSections();
    @GET("Meetings")
    Call<ODataResponse<PurdueMeeting>> getAllMeetings();
    @GET("Instructors")
    Call<ODataResponse<PurdueInstructor>> getAllInstructors();
    @GET("Campuses")
    Call<ODataResponse<PurdueCampus>> getAllCampuses();
    @GET("Buildings")
    Call<ODataResponse<PurdueBuilding>> getAllBuildings();
    @GET("Rooms")
    Call<ODataResponse<PurdueRoom>> getAllRooms();
}
