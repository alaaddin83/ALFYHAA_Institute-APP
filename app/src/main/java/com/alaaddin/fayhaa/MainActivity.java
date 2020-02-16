package com.alaaddin.fayhaa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Button btn_about, btn_course, btn_lastcourse, btn_success, btn_courseto_all;
    ImageButton  IB_face,IB_twit,IB_whats,IB_ins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,About_Instut.class);
                startActivity(intent);
            }
        });

        btn_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Courses_List_Activity.class);
                startActivity(intent);

            }
        });
        btn_lastcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, About_Program_For_All.class);
                startActivity(intent);

            }
        });

        btn_courseto_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, About_Hadis_Izhb.class);
                startActivity(intent);

            }
        });

        btn_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, About_Success.class);
                startActivity(intent);

            }
        });
        IB_face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  FACE =new Intent(Intent.ACTION_VIEW);
                FACE.setData(Uri.parse("https://facebook.com/alfyhaa.org/"));
                if (FACE.resolveActivity(getPackageManager()) !=null) {
                    startActivity(FACE);}

            }
        });

        IB_twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  twit =new Intent(Intent.ACTION_VIEW);
                twit.setData(Uri.parse("https://twitter.com/alfyhaa.org/"));
                if (twit.resolveActivity(getPackageManager()) !=null) {
                    startActivity(twit);
                }
            }
        });

        IB_whats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("smsto:"+"00905313814802");
                Intent  whats =new Intent(Intent.ACTION_SENDTO,uri);
                whats.setPackage("com.whatsapp");
                try {
                    startActivity(whats);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getApplicationContext(),"Whatsap not installed",Toast.LENGTH_SHORT).show();
                }
            }
        });

        IB_ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent website =new Intent(Intent.ACTION_VIEW);
                website.setData(Uri.parse("https://www.fayhaa-inst.org/"));
                if (website.resolveActivity(getPackageManager()) !=null) {
                    startActivity(website);}
            }
        });
    }

    private void initViews() {
        btn_about = (Button) findViewById(R.id.BTN_about_us);
        btn_course = (Button) findViewById(R.id.btn_nowcourse);
        btn_lastcourse = (Button) findViewById(R.id.btn_lastcours);
        btn_courseto_all = (Button) findViewById(R.id.btn_courstoall);
        btn_success = (Button) findViewById(R.id.btn_success);

        IB_face = (ImageButton) findViewById(R.id.btn_FACEBOOK);
        IB_twit = (ImageButton) findViewById(R.id.btn_twitter);
        IB_whats = (ImageButton) findViewById(R.id.btn_whatsapp);
        IB_ins = (ImageButton) findViewById(R.id.btn_websıte);

    }


    //ACTION BAR  ACTIVITE

    //share btn  code:
    public void app_share() {
        String txtshare = "تطبيق معهد الفيحاء ";
        String sharelink = "https://www.facebook.com/alfyhaa.org/";

        Intent share =new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_TEXT,txtshare +" \n"+ sharelink);
        startActivity(share);
    }

    //email  btn  code
    public void app_email() {
        String text="السلام عليكم ورحمة الله وبركاته \n  اقتراحي هو : ";
        Intent sendemail =new Intent(Intent.ACTION_SEND);
        sendemail.setData(Uri.parse("mailto:"));
        sendemail.setType("mesage/rfc822");
        //sendemail.putExtra(Intent.EXTRA_EMAIL,"alaaeddinfa83@gmail.com");
        sendemail.putExtra(Intent.EXTRA_SUBJECT,"تطبيق معهد الفيحاء");
        sendemail.putExtra(Intent.EXTRA_TEXT,text);
        startActivity(sendemail);

    }

    //  creat  menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id =item.getItemId();
        switch (id){
            case R.id.menu_group:
               // Toast.makeText(this,"GROUP",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,Developers.class);
                startActivity(intent);

                return true;
            case    R.id.menu_share:
                //Toast.makeText(this, "SHARE", Toast.LENGTH_LONG).show();
                app_share();
                return true;
            case R.id.menu_suj :
                Toast.makeText(this,"مقترحاتكم",Toast.LENGTH_LONG).show();
                app_email();
                return true;
            case R.id.menu_close:
                Toast.makeText(this, "Closed", Toast.LENGTH_LONG).show();
                finish();
        }

        return false;
    }
    }
