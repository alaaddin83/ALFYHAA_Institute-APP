package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class About_Hadis_Izhb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis__izhb);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfview_go);



        pdfView.fromAsset("go.pdf").load();


    }
}
