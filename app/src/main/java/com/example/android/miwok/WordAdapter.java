package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 2016/9/6.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, int resource, ArrayList<Word> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentAndroidFlavor = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwork_text_view);
        nameTextView.setText(currentAndroidFlavor.getMmiwokword());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        numberTextView.setText(currentAndroidFlavor.getMengword());

        return listItemView;
    }



}
