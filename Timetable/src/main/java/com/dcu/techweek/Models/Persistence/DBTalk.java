package com.dcu.techweek.Models.Persistence;

/**
 * Created by danmalone on 03/03/2014.
 */


import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Table(name = "Logins")
public class DBTalk extends Model {


    @Column(name = "TalkId")
    public String talkId;

    @Column(name = "Title")
    public String title;

    @Column(name = "Time")
    public int time;

    @Column(name = "Day")
    public int day;

    @Column(name = "Venue")
    public String venue;

    @Column(name = "Blurb")
    public String blurb;


    public DBTalk() {
        super();
    }

    public DBTalk(String talkId, String title, int time, int day, String venue, String blurb) {
        super();
        this.talkId = talkId;
        this.title = title;
        this.time = time;
        this.day = day;
        this.venue = venue;
        this.blurb = blurb;
    }

    public static DBTalk getByTalkID(String talkId) {
        return new Select().from(DBTalk.class).where("TalkId = ?", talkId).executeSingle();
    }


    public static List<DBTalk> getByTalksByDay(int day) {
        return new Select().from(DBTalk.class).where("day = ?", day).execute();
    }

}

