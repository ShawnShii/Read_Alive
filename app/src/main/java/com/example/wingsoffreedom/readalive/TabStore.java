package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;


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
        ExpandableListView expListView = (ExpandableListView) rootView.findViewById(R.id.book_category);

        // preparing list data
        prepareListData();

        //listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);



        Button cart = (Button) rootView.findViewById(R.id.button_cart);

        Bundle extras = getActivity().getIntent().getExtras();
        Boolean bought = extras.getBoolean("bought");


        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ShoppingCart.class);

                Bundle extras = getActivity().getIntent().getExtras();
                String name = extras.getString("name");
                String avatar = extras.getString("avatar");
                Boolean bought = extras.getBoolean("bought");

                intent.putExtra("name", name);
                intent.putExtra("bought", bought);
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


        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Chapter Books");
        listDataHeader.add("Picture Books");
        listDataHeader.add("Other Categories");

        // Adding child data
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
}
