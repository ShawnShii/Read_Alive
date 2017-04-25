package com.example.wingsoffreedom.readalive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by WingsofFreedom on 4/24/17.
 */

public class TabLibrary extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_library, container, false);

        ImageButton read_polar = (ImageButton) rootView.findViewById(R.id.book_cover);

        read_polar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Read.class);
                startActivity(intent);
            }

        });

        return rootView;
    }
}
