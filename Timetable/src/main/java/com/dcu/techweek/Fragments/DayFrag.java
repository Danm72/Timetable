package com.dcu.techweek.Fragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dcu.techweek.Adapters.TalkAdapter;
import com.dcu.techweek.Models.Persistence.DBTalk;
import com.dcu.techweek.R;

import java.util.List;

/**
 * Created by danmalone on 03/03/2014.
 */

/**
 * A placeholder fragment containing a simple view.
 */

//@EFragment(R.layout.listfrag)
public class DayFrag extends ListFragment {

//    @ViewById
//    TextView tvName;
//
//    @ViewById
//    TextView tvLocation;
//
//    @ViewById
//    TextView tvBlurbContent;
//
//    @ViewById
//    EditText etDate;
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */

    public static DayFrag newInstance(int sectionNumber) {
        DayFrag fragment = new DayFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public DayFrag() {
    }

//    @AfterViews
//    void calledAfterViewInjection(){
//        Log.d("","");
//    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TalkAdapter adapter = new TalkAdapter(getActivity());

        Bundle bundle = this.getArguments();
        int day = bundle.getInt(ARG_SECTION_NUMBER) +1;


        List<DBTalk> talks = DBTalk.getByTalksByDay(day);
        for (DBTalk talk : talks) {
            adapter.add(talk);
        }
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.listfrag, container, false);

        return root;
    }
}


