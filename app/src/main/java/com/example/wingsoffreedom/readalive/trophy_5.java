package com.example.wingsoffreedom.readalive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class trophy_5 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View rootView = inflater.inflate(R.layout.fragment_trophy_5, container, false);

        final TextView close = (TextView) rootView.findViewById(R.id.closeTrophy);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView trophy_img = (ImageView) rootView.findViewById(R.id.trophy_finish_5_pic);
                TextView trophy_txt = (TextView) rootView.findViewById(R.id.trophy_5_txt);
                FrameLayout trophy_layout = (FrameLayout) rootView.findViewById(R.id.trophy_5_popup);

                trophy_img.setImageResource(0);
                trophy_txt.setText("");
                close.setText("");
                trophy_layout.setVisibility(View.INVISIBLE);
            }
        });

        return rootView;
    }
}
