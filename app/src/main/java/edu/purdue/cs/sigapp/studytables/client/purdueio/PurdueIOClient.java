package edu.purdue.cs.sigapp.studytables.client.purdueio;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mvieck on 1/18/17.
 */

public class PurdueIOClient {
    public static final String BASE_URL = "http://api.purdue.io/odata/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
