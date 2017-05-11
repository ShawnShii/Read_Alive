package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ShoppingCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        Bundle extras = getIntent().getExtras();
        Boolean bought = extras.getBoolean("bought");
        Boolean bought_cat = extras.getBoolean("bought_cat");
        TextView none = (TextView) findViewById(R.id.no_books);
        TextView total = (TextView) findViewById(R.id.total);

        if (bought && bought_cat) {
            ImageView cover = (ImageView) findViewById(R.id.cover);
            TextView title = (TextView) findViewById(R.id.title);
            TextView author = (TextView) findViewById(R.id.author);
            TextView grade = (TextView) findViewById(R.id.grade);

            cover.setImageResource(0);
            title.setText("");
            author.setText("");
            grade.setText("");


            ImageView cover2 = (ImageView) findViewById(R.id.cover2);
            TextView title2 = (TextView) findViewById(R.id.title2);
            TextView author2 = (TextView) findViewById(R.id.author2);
            TextView grade2 = (TextView) findViewById(R.id.grade2);

            cover2.setImageResource(0);
            title2.setText("");
            author2.setText("");
            grade2.setText("");
        }


        if (bought && bought_cat) {
            none.setText("Oh no! Looks like you have no books in your shopping cart! Browse the store for more");
            total.setText("Total: $0.00");
        }

        Button checkout = (Button) findViewById(R.id.button_checkout);
        TextView back = (TextView) findViewById(R.id.store_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

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
                    intent.putExtra("bought_cat", true);
                    intent.putExtra("avatar", avatar);

                    Toast.makeText(ShoppingCart.this, "Congratulations! You just checked out all your books", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
            }

        });

    }
}
