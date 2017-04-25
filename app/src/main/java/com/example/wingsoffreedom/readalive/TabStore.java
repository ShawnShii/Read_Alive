package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by WingsofFreedom on 4/24/17.
 */

public class TabStore extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_store, container, false);

        Button cart = (Button) rootView.findViewById(R.id.button_cart);

        Bundle extras = getActivity().getIntent().getExtras();
        Boolean bought = extras.getBoolean("bought");


        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ShoppingCart.class);

                Bundle extras = getActivity().getIntent().getExtras();
                String name = extras.getString("name");
                Boolean bought = extras.getBoolean("bought");

                intent.putExtra("name", name);
                intent.putExtra("bought", bought);

                startActivity(intent);
            }

        });

        return rootView;
    }
}
