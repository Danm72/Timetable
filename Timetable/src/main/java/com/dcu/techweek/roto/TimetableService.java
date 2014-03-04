package com.dcu.techweek.roto;

import com.dcu.techweek.Models.Network.Talk;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by danmalone on 03/03/2014.
 */
public interface TimetableService {

    static String serverPath = "http://techweek.dcu.ie";

    @GET("/json.php")
    public void getTimetables(Callback<List<Talk>> callback);
}
