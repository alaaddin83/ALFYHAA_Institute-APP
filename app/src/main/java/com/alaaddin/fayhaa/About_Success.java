package com.alaaddin.fayhaa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;

public class About_Success extends AppCompatActivity {

    //TextView student_conter,courses_no,courses_hours;

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        pdfView = (PDFView) findViewById(R.id.pdfview_SUCCES);



        pdfView.fromAsset("succes.pdf").load();



//        student_conter=(TextView)findViewById(R.id.textView_counter);
//        courses_no=(TextView)findViewById(R.id.textView_c_counter);
//        courses_hours=(TextView)findViewById(R.id.textView_c_h2);
//
//        student_conter.setText("191");
//        courses_no.setText("19");
//        courses_hours.setText("1426");

//        ArrayList<Course_item> project =new ArrayList<Course_item>();
//        project.add(new Course_item("مشروع تخرج دورة صيانة الحاسوب" , R.drawable.project));
//        project.add(new Course_item("مشروع تخرج دورة صيانة الجوال" , R.drawable.project));
//        project.add(new Course_item("مشروع تخرج دورة التصميم والمونتاج (افترافيكت)" , R.drawable.project));
//
//        // adapter knows how to create list items for each item in the list.
//        ProjectAddapter adapter = new ProjectAddapter(this, project);
//        ListView listv = (ListView) findViewById(R.id.listview_proj);
//        listv.setAdapter(adapter);


    }

}
