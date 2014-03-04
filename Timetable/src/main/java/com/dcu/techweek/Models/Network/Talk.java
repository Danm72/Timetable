package com.dcu.techweek.Models.Network;

/**
 * Created by danmalone on 28/02/2014.
 */
public class Talk {
    public String id;
    public String title;
    public String time;
    public String venue;
    public String blurb;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }
}
