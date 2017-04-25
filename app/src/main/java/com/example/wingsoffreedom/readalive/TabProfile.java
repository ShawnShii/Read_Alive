package com.example.wingsoffreedom.readalive;

/**
 * Created by WingsofFreedom on 4/24/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.name;

public class TabProfile extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_profile, container, false);
        Bundle extras = getActivity().getIntent().getExtras();
        String name = extras.getString("name");
        String avatar = extras.getString("avatar");

        TextView userName = (TextView) rootView.findViewById(R.id.profileName);
        userName.setText(name);
        ImageView profile_avatar = (ImageView) rootView.findViewById(R.id.avatar_profile);

        if (avatar.equals("pig")) {
            profile_avatar.setImageResource(R.drawable.pig_avatar);
        } else if (avatar.equals("panda")) {
            profile_avatar.setImageResource(R.drawable.panda_avatar);
        } else if (avatar.equals("bear")) {
            profile_avatar.setImageResource(R.drawable.bear_avatar);
        } else if (avatar.equals("frog")) {
            profile_avatar.setImageResource(R.drawable.frog_avatar);
        } else {
            profile_avatar.setImageResource(R.drawable.monkey_avatar);
        }

        return rootView;
    }
}
