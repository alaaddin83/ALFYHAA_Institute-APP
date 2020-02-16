package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Courses_List_Activity extends AppCompatActivity {

    Button btn_course1, btn_course2, btn_course3, btn_course4, btn_course5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses__list_);

        initViews();

        btn_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Courses_List_Activity.this, About_Fifth_Courses.class);
                startActivity(intent);
            }
        });
        btn_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Courses_List_Activity.this, Disply_Forth_Courses.class);
                startActivity(intent);
            }
        });
        btn_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Courses_List_Activity.this, Disply_Third_courses.class);
                startActivity(intent);
            }
        });
        btn_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Courses_List_Activity.this, Disply_Second_Course.class);
                startActivity(intent);
            }
        });

        btn_course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Courses_List_Activity.this, Disply_First_Courses.class);
                startActivity(intent);
            }
        });



    }

    private void initViews() {
        btn_course1 = (Button) findViewById(R.id.BTN_success_5);
        btn_course2 = (Button) findViewById(R.id.btn_success_4);
        btn_course3 = (Button) findViewById(R.id.btn_success_3);
        btn_course4 = (Button) findViewById(R.id.btn_success_2);
        btn_course5 = (Button) findViewById(R.id.btn_success_1);

    }

}
