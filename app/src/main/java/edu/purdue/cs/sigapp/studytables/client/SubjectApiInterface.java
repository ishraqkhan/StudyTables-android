package edu.purdue.cs.sigapp.studytables.client;

import javax.security.auth.Subject;

import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueSubject;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mvieck on 1/18/17.
 */

public interface SubjectApiInterface {
    @GET("Subjects")
    Call<ODataResponse<PurdueSubject>> getAllSubjects();
}
