package com.example.wingsoffreedom.readalive;

/**
 * Created by WingsofFreedom on 4/24/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.R.attr.name;

public class TabProfile extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_profile, container, false);
        Bundle extras = getActivity().getIntent().getExtras();
        String name = extras.getString("name");

        TextView userName = (TextView) rootView.findViewById(R.id.profileName);
        userName.setText(name);

        return rootView;
    }
}
