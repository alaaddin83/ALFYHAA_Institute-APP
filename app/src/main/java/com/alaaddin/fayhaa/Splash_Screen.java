package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class Splash_Screen extends AppCompatActivity {

    protected boolean _active = true;
    protected int _splashTime = 3000; // time to display the splash screen in ms

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (_active && (waited < _splashTime)) {
                        sleep(3000);
                        if (_active) {
                            waited += 3000;
                        }
                    }
                } catch (Exception e) {

                } finally {

                    startActivity(new Intent(Splash_Screen.this,
                            MainActivity.class));
                    finish();
                }
            };
        };
        splashTread.start();

//    Thread thread = new Thread(){
//
//        @Override
//        public void run() {
//            try {
//                sleep(SPLASH_DISPLAY_LENGTH);
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
//                finish();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    };
//
//    thread.start();


    }
}
