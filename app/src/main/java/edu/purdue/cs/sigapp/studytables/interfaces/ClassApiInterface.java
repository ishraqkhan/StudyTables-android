package edu.purdue.cs.sigapp.studytables.interfaces;

import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueClass;
import edu.purdue.cs.sigapp.studytables.classes.activity.PurdueSubject;
import edu.purdue.cs.sigapp.studytables.client.ODataResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mvieck on 1/18/17.
 */

public interface ClassApiInterface {
    @GET("Classes")
    Call<ODataResponse<PurdueClass>> getAllClasses();
}
