package com.haerul.livesearchretrofitget;

import com.google.gson.annotations.SerializedName;

/**
 * Created by haerul on 17/03/18.
 */

public class Contact {

    @SerializedName("ST_id") private int ST_id;
    @SerializedName("ST_Firstname") private String ST_Firstname;
    @SerializedName("ST_Username") private String ST_Username;

    public int getId() {
        return ST_id;
    }

    public String getName() {
        return ST_Firstname;
    }

    public String getEmail() {
        return ST_Username;
    }
}
