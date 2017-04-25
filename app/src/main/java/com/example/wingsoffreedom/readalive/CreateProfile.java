package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateProfile extends AppCompatActivity {
    int entered_name;
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

                String name = nameInput.getText().toString();

                if (name == null || name == "" || name.isEmpty()) {
                    Toast.makeText(CreateProfile.this, "please enter something in text box", Toast.LENGTH_SHORT).show();

                }
                Intent intent = new Intent(CreateProfile.this, ReadAlive.class);
                intent.putExtra("name", nameInput.getText().toString());
                startActivity(intent);

            }

        });

        

    }
}
