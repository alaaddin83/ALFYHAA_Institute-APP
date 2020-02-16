package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;


public class About_Third_Courses extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__third__courses);

        pdfView = (PDFView) findViewById(R.id.pdfview_thirdcours);

        Intent data = getIntent();
        int textpage =data.getExtras().getInt("course");
        textpage ++ ;

        pdfView.fromAsset("third"+textpage+".pdf").load();

    }
}
