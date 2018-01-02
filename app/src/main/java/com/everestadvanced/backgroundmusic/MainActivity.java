package com.everestadvanced.backgroundmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnstart,btnstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart= (Button) findViewById(R.id.startmusic);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent svc3=new Intent(getApplicationContext(), CheckBattryLevelService.class);
                startService(svc3);
            }
        });

        btnstop= (Button) findViewById(R.id.stopmusic);
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent svc4=new Intent(getApplicationContext(), CheckBattryLevelService.class);
                stopService(svc4);
            }
        });
    }
}
