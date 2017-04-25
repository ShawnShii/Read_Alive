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


        if (name.equals("Ellen Smith")) {
            ImageView gold = (ImageView) rootView.findViewById(R.id.gold_earned);
            ImageView silver = (ImageView) rootView.findViewById(R.id.silver_earned);
            ImageView bronze = (ImageView) rootView.findViewById(R.id.bronze_earned);
            ImageView bronze_2 = (ImageView) rootView.findViewById(R.id.bronze_earned_2);
            ImageView bronze_3 = (ImageView) rootView.findViewById(R.id.bronze_earned_3);

            gold.setImageResource(R.drawable.gold);
            silver.setImageResource(R.drawable.silver);
            bronze.setImageResource(R.drawable.bronze);
            bronze_2.setImageResource(R.drawable.bronze);
            bronze_3.setImageResource(R.drawable.bronze);
        }

        return rootView;
    }
}
