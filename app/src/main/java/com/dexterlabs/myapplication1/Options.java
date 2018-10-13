package com.dexterlabs.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Options extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }

    public void switch1(View view)
    {

        String button_text;

        button_text=((Button) view).getText().toString();

        if(button_text.equals("Moving") || button_text.equals("Moving and Packing"))
        {
            Intent intent=new Intent(this,MapsActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent=new Intent(this,MapsActivity.class);
            startActivity(intent);
        }


    }//switch1



}
