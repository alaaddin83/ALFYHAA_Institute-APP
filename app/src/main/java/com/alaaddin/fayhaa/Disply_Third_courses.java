package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.alaaddin.fayhaa.adapter.CourseAddapter;
import com.alaaddin.fayhaa.module.Course_item;

import java.util.ArrayList;

public class Disply_Third_courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_courses);

        ArrayList<Course_item> COURSE =new ArrayList<Course_item>();
        COURSE.add(new Course_item("دورة صيانة الجوال " , R.drawable.phone));
        COURSE.add(new Course_item("دورة برمجة ويب web " , R.drawable.web));
        COURSE.add(new Course_item("دورة تسويق الكتروني" , R.drawable.market));
        COURSE.add(new Course_item("دورة أدوبي فوتوشوب" , R.drawable.poto));
        COURSE.add(new Course_item("دورة أدوبي بريمير" , R.drawable.prim));
        COURSE.add(new Course_item("دورة تمديدات الكهرباء المنزلية" , R.drawable.h_elec));
        COURSE.add(new Course_item("منهاج مرافق للدورة الثالثة (لغة تركية)" , R.drawable.turk));

        // adapter knows how to create list items for each item in the list.
        CourseAddapter adapter = new CourseAddapter(this, COURSE);

        ListView listView = (ListView) findViewById(R.id.lv_courses_3);
        listView.setAdapter(adapter);

        // تفعيل الانتقال الة الصفحة التالية
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(Disply_Third_courses.this,About_Third_Courses.class);
                intent.putExtra("course",position);
                startActivity(intent);

            }
        });
    }


    }

