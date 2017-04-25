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
            String name = (String) nameInput.getText().toString();

            if (name.isEmpty()) {
                Toast.makeText(CreateProfile.this, "Must enter a UserName", Toast.LENGTH_LONG).show();

            } else {
                Intent intent = new Intent(CreateProfile.this, ReadAlive.class);

                intent.putExtra("name", name);

                /*
                ChooseProfile.new_name.setText(name);
                ChooseProfile.new_profile.setImageResource(R.drawable.profile);
                ChooseProfile.new_profile.setId(R.id.add_profile_btn);
                ChooseProfile.add_profile.setId(R.id.new_profile);*/

                startActivity(intent);
            }
            }

        });
        nameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
