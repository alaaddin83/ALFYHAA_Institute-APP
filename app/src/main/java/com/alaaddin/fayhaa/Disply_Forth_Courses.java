package com.alaaddin.fayhaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.alaaddin.fayhaa.adapter.CourseAddapter;
import com.alaaddin.fayhaa.module.Course_item;

import java.util.ArrayList;

public class Disply_Forth_Courses extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses__last);


        ArrayList<Course_item> COURSE = new ArrayList<Course_item>();
        COURSE.add(new Course_item("دورة صيانة الجوال ", R.drawable.phone));
        COURSE.add(new Course_item("دورة الشبكات وصيانة الحاسب ", R.drawable.laptop));
        COURSE.add(new Course_item("دورة برمجة تطبيقات الاندرويد ", R.drawable.andro));
        COURSE.add(new Course_item("دورة سكرتاريا وقيادة حاسب آلي", R.drawable.office));
        COURSE.add(new Course_item("دورة أدوبي فوتوشوب", R.drawable.poto));
        COURSE.add(new Course_item("دورة أدوبي بريمير", R.drawable.prim));
        COURSE.add(new Course_item("دورة ادارة المشاريع التنموية PMD", R.drawable.pmd));
        COURSE.add(new Course_item("دورة ادارة المشاريع الصغيرة", R.drawable.market));
        COURSE.add(new Course_item("دورة صناعة الحلويات", R.drawable.kick));
        COURSE.add(new Course_item("دورة صيانة الأدوات الكهربائية", R.drawable.electr));
        COURSE.add(new Course_item("دورة تمديدات الكهرباء المنزلية", R.drawable.h_elec));
        COURSE.add(new Course_item("دورة لغة تركية مستوى اول", R.drawable.turk));

        // adapter knows how to create list items for each item in the list.
        CourseAddapter adapter = new CourseAddapter(this, COURSE);

        ListView listView = (ListView) findViewById(R.id.lv_courses_2);
        listView.setAdapter(adapter);

        // تفعيل الانتقال الة الصفحة التالية
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(Disply_Forth_Courses.this, About_Forth_Courses.class);
                intent.putExtra("course", position);
                startActivity(intent);

            }
        });

    }
}


//        spinner =(Spinner)findViewById(R.id.spinner_1);
//        adapter2= ArrayAdapter.createFromResource(this,R.array.courses_array,R.layout.spinner_item);
//        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter2);
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//                //String text= parent.getItemAtPosition(position).toString();
//                switch (position){
//
//                    case 0:
//                      //  Toast.makeText(parent.getContext(),"لم يتم الاختيار",Toast.LENGTH_SHORT).show();
//
//                         break;
//                    case  1:
//                        Intent intent=new Intent(Disply_Forth_Courses.this,Disply_Forth_Courses.class);
//                        startActivity(intent);
//                        //startActivityForResult(intent, 1);
//                         break;
//                    case 2 :
//                        Intent intent2=new Intent(Disply_Forth_Courses.this,Disply_Third_courses.class);
//                        startActivity(intent2);
//                           break;
//                    case 3:
//                        Intent intent3=new Intent(Disply_Forth_Courses.this,Disply_Second_Course.class);
//                        startActivity(intent3);
//
//                        break;
//                    case 4:
//                        Intent intent4=new Intent(Disply_Forth_Courses.this,Disply_First_Courses.class);
//                        startActivity(intent4);
//                        break;
//                    case 5:
//                        Intent intent5=new Intent(Disply_Forth_Courses.this,About_Program_For_All.class);
//                        startActivity(intent5);
//                        break;
//                    case 5:
//                        Intent intent6=new Intent(Disply_Forth_Courses.this,About_Fifth_Courses.class);
//                        startActivity(intent6);
//                        break;
//                        Toast toast1= Toast.makeText(parent.getContext(),"لايتوفر معلومات عن الدورة الاولى في الوقت الحالي",Toast.LENGTH_LONG);
//                        toast1.setGravity(Gravity.TOP,0,210);
//                        View color1= toast1.getView();
//                        color1.setBackgroundColor(Color.parseColor("#2962ff"));
//                        toast1.show();
//                        break;
//                }
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
////                Intent intent=new Intent(Disply_Forth_Courses.this,Disply_Forth_Courses.class);
////                startActivity(intent);
//
//            }
//        });



//    @Override
//    protected void onRestart() {
//        spinner.setAdapter(adapter2);
//        super.onRestart();
//    }
//
////    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//
//        if (requestCode==1){
//
//        }
//        super.onActivityResult(requestCode, resultCode, data);
//    }
