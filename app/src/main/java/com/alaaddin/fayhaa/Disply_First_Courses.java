package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Disply_First_Courses extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__courses);

        textView= (TextView)findViewById(R.id.tv_courses_01) ;

        Toast toast= Toast.makeText(Disply_First_Courses.this,
                "لايتوفر معلومات عن الدورة الأولى في الوقت الحالي",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,120);
        View color= toast.getView();
        color.setBackgroundColor(Color.parseColor("#2962ff"));
        toast.show();
    }
}
