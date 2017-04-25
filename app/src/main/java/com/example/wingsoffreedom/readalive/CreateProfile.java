package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        Button cancel = (Button) findViewById(R.id.cancel_create);
        Button create = (Button) findViewById(R.id.continue_create);

        final EditText nameInput = (EditText) findViewById(R.id.name_input);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateProfile.this, ChooseProfile.class);
                startActivity(intent);
            }

        });

        create.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateProfile.this, ReadAlive.class);
                intent.putExtra("name", (String) nameInput.getText().toString());
                startActivity(intent);
            }

        });

    }
}
