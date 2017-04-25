package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ShoppingCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        Bundle extras = getIntent().getExtras();
        Boolean bought = extras.getBoolean("bought");

        if (bought) {
            ImageButton cover = (ImageButton) findViewById(R.id.cover);
            TextView title = (TextView) findViewById(R.id.title);
            TextView author = (TextView) findViewById(R.id.author);
            TextView grade = (TextView) findViewById(R.id.grade);
            TextView none = (TextView) findViewById(R.id.no_books);
            TextView total = (TextView) findViewById(R.id.total);

            cover.setImageResource(0);
            title.setText("");
            author.setText("");
            grade.setText("");
            none.setText("Oh no! Looks like you have no books in your shopping cart! Browse the store for more");
            total.setText("Total: $0.00");
        }


        Button checkout = (Button) findViewById(R.id.button_checkout);

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingCart.this, ReadAlive.class);

                Bundle extras = getIntent().getExtras();
                String name = extras.getString("name");
                String avatar = extras.getString("avatar");
                Boolean bought = extras.getBoolean("bought");

                if (bought) {
                    Toast.makeText(ShoppingCart.this, "Oops! There are no books in your shopping cart!", Toast.LENGTH_LONG).show();
                } else {
                    intent.putExtra("name", name);
                    intent.putExtra("bought", true);
                    intent.putExtra("avatar", avatar);

                    Toast.makeText(ShoppingCart.this, "Congratulations! You just bought The Polar Express", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
            }

        });


    }
}
