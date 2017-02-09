package edu.purdue.cs.sigapp.studytables.interfaces;

import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueBuilding;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueCampus;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueClass;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueCourse;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueInstructor;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueMeeting;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueRoom;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueSection;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueSubject;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueTerm;
import edu.purdue.cs.sigapp.studytables.client.ODataResponse;
import retrofit2.Call;
import retrofit2.http.GET;

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
