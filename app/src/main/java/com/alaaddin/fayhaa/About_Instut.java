package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class About_Instut extends AppCompatActivity {

    private static final String TAG = "About_Instut";

    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__instut);

        pdfView = (PDFView) findViewById(R.id.pdfview);

        pdfView.fromAsset("about_us.pdf").load();

    }


}


//  read   text file from assets

//        about =(TextView)findViewById(R.id.tV_ABOUT);
//        InputStream input = null;
//        try {
//
//            input=getAssets().open("instit.txt");
//            int size= input.available();
//            byte [] about_txt = new byte[size];
//            input.read(about_txt);
//            input.close();
//            String text =new String(about_txt);
//            about.setText(text);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

