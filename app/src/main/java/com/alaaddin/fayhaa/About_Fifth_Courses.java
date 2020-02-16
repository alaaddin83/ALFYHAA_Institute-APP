package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.IOException;
import java.io.InputStream;

public class About_Fifth_Courses extends AppCompatActivity {

    PDFView pdfView;

    //TextView aboutcourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_course__now);

        pdfView = (PDFView) findViewById(R.id.pdfview_nowcours);

        pdfView.fromAsset("fifth_courses.pdf").load();


//        InputStream input = null;
//        try {
//            AssetManager assetManager = getAssets();
//            input=assetManager.open( textpage+".txt");
//            int size= input.available();
//            byte [] about_txt = new byte[size];
//            input.read(about_txt);
//            input.close();
//            String text =new String(about_txt);
//            aboutcourse.setText(text);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (input != null) {
//                try {
//                    input.close();
//                } catch (IOException e) {
//                    //log the exception
//                }
//            }
    }
}
