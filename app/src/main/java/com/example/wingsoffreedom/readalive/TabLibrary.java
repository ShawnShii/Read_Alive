package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by WingsofFreedom on 4/24/17.
 */

public class TabLibrary extends Fragment {

    public static ImageView bookPage;
    public static TextView title;
    public static TextView author;
    public static TextView grade;

    public static ImageView bookPage2;
    public static TextView title2;
    public static TextView author2;
    public static TextView grade2;

    public static TextView no_books;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_library, container, false);

        bookPage = (ImageView) rootView.findViewById(R.id.book_cover);
        title = (TextView) rootView.findViewById(R.id.book_title);
        author = (TextView) rootView.findViewById(R.id.book_author);
        grade = (TextView) rootView.findViewById(R.id.book_grade);
        no_books = (TextView) rootView.findViewById(R.id.text_no_books);

        bookPage2 = (ImageView) rootView.findViewById(R.id.book_cover2);
        title2 = (TextView) rootView.findViewById(R.id.book_title_2);
        author2 = (TextView) rootView.findViewById(R.id.book_author_2);
        grade2 = (TextView) rootView.findViewById(R.id.book_grade_2);

        Bundle extras = getActivity().getIntent().getExtras();
        Boolean bought = extras.getBoolean("bought");
        Boolean bought_cat = extras.getBoolean("bought_cat");

        if (bought) {
            bookPage.setImageResource(R.drawable.the_polar_express);
            title.setText("The Polar Express");
            author.setText("by Chris Van Allsburg");
            grade.setText("First Grade");
            no_books.setText("");

            bookPage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle extras = getActivity().getIntent().getExtras();
                    String avatar = extras.getString("avatar");
                    Intent intent = new Intent(getActivity(), Read.class);
                    intent.putExtra("bought", true);
                    intent.putExtra("avatar", avatar);
                    startActivity(intent);
                }

            });
        }

        if (bought_cat) {
            bookPage2.setImageResource(R.drawable.cat_hat_cover);
            title2.setText("The Cat in the Hat");
            author2.setText("by Dr. Seuss");
            grade2.setText("First Grade");
            no_books.setText("");

            bookPage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle extras = getActivity().getIntent().getExtras();
                    String avatar = extras.getString("avatar");
                    Intent intent = new Intent(getActivity(), Read_Cat.class);
                    intent.putExtra("bought_cat", true);
                    intent.putExtra("avatar", avatar);
                    startActivity(intent);
                }

            });
        }

        return rootView;
    }
}
