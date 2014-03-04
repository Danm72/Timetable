package com.dcu.techweek.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dcu.techweek.Models.Persistence.DBTalk;
import com.dcu.techweek.R;

import java.util.LinkedList;

/**
 * Created by danmalone on 03/03/2014.
 */

public class TalkAdapter extends BaseAdapter {

    LinkedList<DBTalk> talks = new LinkedList<DBTalk>();

    Context context;

    public TalkAdapter(Context context) {
        super();
        this.context = context;
    }

    public void add(DBTalk object) {
        talks.add(object);
    }

    @Override
    public int getCount() {
        return talks.size();
    }

    @Override
    public Object getItem(int position) {
        return talks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return talks.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.fragment_main, parent, false);

        if (!talks.isEmpty()) {
            TextView title = (TextView) rowView.findViewById(R.id.tvName);
            title.setText(talks.get(position).title);

            TextView venue = (TextView) rowView.findViewById(R.id.tvLocation);
            venue.setText(talks.get(position).venue +" : "+ talks.get(position).time+":00");

            TextView blurb = (TextView) rowView.findViewById(R.id.tvBlurbContent);
            blurb.setText(talks.get(position).blurb);

        }
        return rowView;
    }
}
