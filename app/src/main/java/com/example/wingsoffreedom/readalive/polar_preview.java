package com.example.wingsoffreedom.readalive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class polar_preview extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View rootView = inflater.inflate(R.layout.polar_preview, container, false);

        final TextView close = (TextView) rootView.findViewById(R.id.close_polar);

        TextView add = (TextView) rootView.findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "The Polar Express has been added to your cart!", Toast.LENGTH_LONG).show();
            }

        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView cover = (ImageView) rootView.findViewById(R.id.polar_cover);
                TextView add = (TextView) rootView.findViewById(R.id.add);
                TextView cost = (TextView) rootView.findViewById(R.id.cost);
                TextView title = (TextView) rootView.findViewById(R.id.title);
                TextView author = (TextView) rootView.findViewById(R.id.author);
                TextView grade = (TextView) rootView.findViewById(R.id.grade);
                TextView sum_tag = (TextView) rootView.findViewById(R.id.sum_tag);
                TextView sum = (TextView) rootView.findViewById(R.id.summary);
                TextView rev_tag = (TextView) rootView.findViewById(R.id.rev_tag);
                TextView rev = (TextView) rootView.findViewById(R.id.reviews);

                FrameLayout preview = (FrameLayout) rootView.findViewById(R.id.polar_preview);

                cover.setImageResource(0);
                add.setText("");
                add.setVisibility(View.INVISIBLE);
                cost.setText("");
                cost.setVisibility(View.INVISIBLE);
                title.setText("");
                author.setText("");
                grade.setText("");
                sum_tag.setText("");
                sum.setText("");
                rev_tag.setText("");
                rev.setText("");
                close.setText("");
                preview.setVisibility(View.INVISIBLE);
            }

        });

        return rootView;
    }
}
