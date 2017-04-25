package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChooseProfile extends AppCompatActivity {

    public static ImageButton new_profile;
    public static ImageButton add_profile;
    public static TextView new_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_profile);

        ImageButton ellen_profile = (ImageButton) findViewById(R.id.ellen_profile_btn);
        add_profile = (ImageButton) findViewById(R.id.add_profile_btn);
        new_profile = (ImageButton) findViewById(R.id.fill_button);
        new_name = (TextView) findViewById(R.id.fill_name);

        ellen_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseProfile.this, ReadAlive.class);
                intent.putExtra("name", "Ellen Smith");
                intent.putExtra("bought", true);
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



    }
}
