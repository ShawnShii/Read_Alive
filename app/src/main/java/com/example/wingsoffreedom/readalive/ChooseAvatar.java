package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChooseAvatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_avatar);

        ImageButton pig = (ImageButton) findViewById(R.id.avatar_pig);
        ImageButton panda = (ImageButton) findViewById(R.id.avatar_panda);
        ImageButton bear = (ImageButton) findViewById(R.id.avatar_bear);
        ImageButton frog = (ImageButton) findViewById(R.id.avatar_frog);
        ImageButton monkey = (ImageButton) findViewById(R.id.avatar_monkey);

        pig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseAvatar.this, CreateProfile.class);
                intent.putExtra("avatar", "pig");
                startActivity(intent);
            }

        });

        panda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseAvatar.this, CreateProfile.class);
                intent.putExtra("avatar", "panda");
                startActivity(intent);
            }

        });

        bear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseAvatar.this, CreateProfile.class);
                intent.putExtra("avatar", "bear");
                startActivity(intent);
            }

        });

        frog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseAvatar.this, CreateProfile.class);
                intent.putExtra("avatar", "frog");
                startActivity(intent);
            }

        });

        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseAvatar.this, CreateProfile.class);
                intent.putExtra("avatar", "monkey");
                startActivity(intent);
            }

        });

    }
}
