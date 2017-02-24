package edu.purdue.cs.sigapp.studytables.client.purdueio;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mvieck on 1/19/17.
 */

public class ODataResponse<T> {
    @SerializedName("value")
    private List<T> terms;

    public List<T> getTerms() {
        return terms;
    }

    public void setTerms(List<T> terms) {
        this.terms = terms;
    }
}
