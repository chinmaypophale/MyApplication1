package com.dexterlabs.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread=new Thread(){
            @Override
            public void run(){
                try{
                    sleep(3*1000);
                    Intent i= new Intent(getApplicationContext(),check.class);
                    startActivity(i);
                }
                catch (Exception e)
                {

                }
            }
        };
        thread.start();


    }
}
