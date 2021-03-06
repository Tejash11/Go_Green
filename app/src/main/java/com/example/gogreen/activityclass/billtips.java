package com.example.gogreen.activityclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.gogreen.R;

public class billtips extends AppCompatActivity {
    LinearLayout audit,dimswitch,refrigerator, heater, led;
    ImageView tipsbackbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billtips);

        Intent i = getIntent();
        Bundle bundle = i.getBundleExtra("bundle");

        audit = findViewById(R.id.audit);
        dimswitch = findViewById(R.id.dimswitch);
        refrigerator = findViewById(R.id.refrigerator);
        heater = findViewById(R.id.waterheater);
        led = findViewById(R.id.led);
        tipsbackbutton = findViewById(R.id.tipslbackbtn);

        tipsbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),MainActivity.class);
                i.putExtra("bundle", bundle);
                startActivity(i);
            }
        });

        audit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),tipsinfo.class);
                i.putExtra("bundle", bundle);
                i.putExtra("audit",1);
                i.putExtra("dimswitch",0);
                i.putExtra("refrigerator",0);
                i.putExtra("heater",0);
                i.putExtra("led",0);
                startActivity(i);
            }
        });

        dimswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),tipsinfo.class);
                i.putExtra("bundle", bundle);
                i.putExtra("audit",0);
                i.putExtra("dimswitch",1);
                i.putExtra("refrigerator",0);
                i.putExtra("heater",0);
                i.putExtra("led",0);
                startActivity(i);
            }
        });

        refrigerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),tipsinfo.class);
                i.putExtra("bundle", bundle);
                i.putExtra("audit",0);
                i.putExtra("dimswitch",0);
                i.putExtra("refrigerator",1);
                i.putExtra("heater",0);
                i.putExtra("led",0);
                startActivity(i);
            }
        });

        heater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),tipsinfo.class);
                i.putExtra("bundle", bundle);
                i.putExtra("audit",0);
                i.putExtra("dimswitch",0);
                i.putExtra("refrigerator",0);
                i.putExtra("heater",1);
                i.putExtra("led",0);
                startActivity(i);
            }
        });

        led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),tipsinfo.class);
                i.putExtra("bundle", bundle);
                i.putExtra("audit",0);
                i.putExtra("dimswitch",0);
                i.putExtra("refrigerator",0);
                i.putExtra("heater",0);
                i.putExtra("led",1);
                startActivity(i);
            }
        });

    }
}