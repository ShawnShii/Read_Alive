package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChooseProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_profile);


        ImageButton profile = (ImageButton) findViewById(R.id.profile_btn);
        ImageButton add_profile = (ImageButton) findViewById(R.id.add_profile_btn);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseProfile.this, ReadAlive.class);
                startActivity(intent);
            }

        });

         add_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseProfile.this, CreateProfile.class);
                startActivity(intent);
            }

        });

        add_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseProfile.this,    CreateProfile.class);
                startActivity(intent);
            }

        });


    }
}
