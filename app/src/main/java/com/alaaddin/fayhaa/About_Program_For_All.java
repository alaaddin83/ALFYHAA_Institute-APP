package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class About_Program_For_All extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program__for__all);

        pdfView = (PDFView) findViewById(R.id.pdfview_all);

//        Intent data = getIntent();
//        int textpage =data.getExtras().getInt("course");
//        textpage ++ ;


        pdfView.fromAsset("program_for_all.pdf").load();

    }
}
