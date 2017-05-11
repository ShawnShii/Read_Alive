package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by WingsofFreedom on 4/24/17.
 */

public class TabStore extends Fragment {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.tab_store, container, false);

        // get the listview
        //ExpandableListView expListView = (ExpandableListView) rootView.findViewById(R.id.book_category);

        // preparing list data
        //prepareListData();

        //listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        //expListView.setAdapter(listAdapter);


        Button cart = (Button) rootView.findViewById(R.id.button_cart);
        Button add_to_cart = (Button) rootView.findViewById(R.id.add_to_cart);
        TextView none = (TextView) rootView.findViewById(R.id.no_store_books);

        Bundle extras = getActivity().getIntent().getExtras();
        Boolean bought = extras.getBoolean("bought");
        Boolean bought_cat = extras.getBoolean("bought_cat");

        ImageView cover = (ImageView) rootView.findViewById(R.id.store_cover);
        ImageView cover2 = (ImageView) rootView.findViewById(R.id.store_cover2);

        if (bought) {
            TextView title = (TextView) rootView.findViewById(R.id.store_title);
            TextView author = (TextView) rootView.findViewById(R.id.store_author);
            TextView grade = (TextView) rootView.findViewById(R.id.store_grade);

            View divide = rootView.findViewById(R.id.separator);

            cover.setImageResource(0);
            title.setText("");
            author.setText("");
            grade.setText("");
            divide.setVisibility(View.INVISIBLE);
        } else {
            cover.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Fragment book = new polar_preview();
                    final FragmentTransaction bookInfoFrag = getChildFragmentManager().beginTransaction();
                    bookInfoFrag.add(R.id.show_book_info, book, "polar").addToBackStack("polar").commit();
                }

            });
        }

        if (bought_cat) {
            TextView title = (TextView) rootView.findViewById(R.id.store_title2);
            TextView author = (TextView) rootView.findViewById(R.id.store_author2);
            TextView grade = (TextView) rootView.findViewById(R.id.store_grade2);

            cover2.setImageResource(0);
            title.setText("");
            author.setText("");
            grade.setText("");

        } else {
            cover2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Fragment book = new cat_preview();
                    final FragmentTransaction bookInfoFrag = getChildFragmentManager().beginTransaction();
                    bookInfoFrag.add(R.id.show_book_info, book, "cat").addToBackStack("cat").commit();
                }

            });
        }

        if (bought && bought_cat) {
            none.setText("Wow! Looks like you've bought all the books in the store! Good job!");
        }

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ShoppingCart.class);

                Bundle extras = getActivity().getIntent().getExtras();
                String name = extras.getString("name");
                String avatar = extras.getString("avatar");
                Boolean bought = extras.getBoolean("bought");
                Boolean bought_cat = extras.getBoolean("bought_cat");

                intent.putExtra("name", name);
                intent.putExtra("bought", bought);
                intent.putExtra("bought_cat", bought_cat);
                intent.putExtra("avatar", avatar);

                startActivity(intent);
            }

        });

        return rootView;
    }
    /*
     * Preparing the list data
     */

    private void prepareListData() {


        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        // Adding child data
        listDataHeader.add("Chapter Books");
        listDataHeader.add("Picture Books");
        listDataHeader.add("Other Categories");

        // Adding child data\
        List<String> chapter_books = new ArrayList<String>();
        chapter_books.add("NonFiction");
        chapter_books.add("Fiction");
        chapter_books.add("Poetry");
        chapter_books.add("Biographies");

        List<String> picture_books = new ArrayList<String>();
        picture_books.add("NonFiction");
        picture_books.add("Fiction");
        picture_books.add("Poetry");
        picture_books.add("Biographies");

        List<String> other = new ArrayList<String>();
        other.add("Nonfiction");
        other.add("Fiction");
        other.add("Poetry");
        other.add("Biographies");

        listDataChild.put(listDataHeader.get(0), chapter_books); // Header, Child data
        listDataChild.put(listDataHeader.get(1), picture_books);
        listDataChild.put(listDataHeader.get(2), other);
    }

    @Override
    public void onDetach() {
        super.onDetach();

        try {
            Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
