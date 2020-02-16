package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.IOException;
import java.io.InputStream;

public class About_Forth_Courses extends AppCompatActivity {

    //TextView aboutcourse;
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_course__last);

        //aboutcourse =(TextView)findViewById(R.id.tv_courses_last);

        pdfView = (PDFView) findViewById(R.id.pdfview_lastcours);

        Intent data = getIntent();
        int textpage =data.getExtras().getInt("course");
        textpage ++ ;

        pdfView.fromAsset("ford"+textpage+".pdf").load();


//        int p =Integer.parseInt("raw"+textpage);
        //InputStream inputStream= getResources().openRawResource(p);

//        InputStream inputStream = null;
//        int size= 0;
//        try {
//            AssetManager assetManager = getAssets();
//             inputStream=assetManager.open( "raw"+textpage+".txt");
//            size = inputStream.available();
//            byte []  buffer = new byte[size];
//            inputStream.read(buffer);
//            inputStream.close();
//            String text =new String(buffer);
//                aboutcourse.setText(text);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
