package com.alaaddin.fayhaa.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.alaaddin.fayhaa.R;
import com.alaaddin.fayhaa.module.Course_item;

import java.util.ArrayList;

public class ProjectAddapter extends ArrayAdapter<Course_item> {

    public ProjectAddapter(Activity context, ArrayList<Course_item> course) {
        super(context, 0, course);
    }

    //خاص لعرض انجازات المعهد تم حذفه

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView== null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.row_project,parent,
                    false) ;
        }
        Course_item currentCourse = getItem( position);
        //find the textview in the list ..layout with id
        TextView course_name_tv = (TextView) listItemView.findViewById(R.id.TV_item_project);
        course_name_tv.setText(currentCourse.getMcourse());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageforproject_iv);
        if (currentCourse.hasImage()) {
            imageView.setImageResource(currentCourse.getmImageResourceId());
            //make sure the view is visibility
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}
