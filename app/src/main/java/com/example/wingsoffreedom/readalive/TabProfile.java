package com.example.wingsoffreedom.readalive;

/**
 * Created by WingsofFreedom on 4/24/17.
 */

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
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

        TextView userChange = (TextView) rootView.findViewById(R.id.user_change);

        userChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChooseProfile.class);
                startActivity(intent);
            }

        });

        ImageView gold = (ImageView) rootView.findViewById(R.id.trophy_r_2_hr);
        ImageView silver = (ImageView) rootView.findViewById(R.id.trophy_r_10_days);
        ImageView bronze = (ImageView) rootView.findViewById(R.id.trophy_finish_pic);

        ImageView gold_2 = (ImageView) rootView.findViewById(R.id.trophy_r_10_week);
        ImageView silver_2 = (ImageView) rootView.findViewById(R.id.trophy_finish_5_pic);
        ImageView bronze_2 = (ImageView) rootView.findViewById(R.id.trophy_r_1_hr_week);

        ImageView gold_3 = (ImageView) rootView.findViewById(R.id.trophy_finish_15_pic);
        ImageView silver_3 = (ImageView) rootView.findViewById(R.id.trophy_10_cat);
        ImageView bronze_3 = (ImageView) rootView.findViewById(R.id.trophy_r_1_hr_day);

        if (name.equals("Ellen Smith")) {
            gold.setImageResource(R.drawable.gold);
            silver.setImageResource(R.drawable.silver);
            bronze.setImageResource(R.drawable.bronze);
            bronze_2.setImageResource(R.drawable.bronze);
            bronze_3.setImageResource(R.drawable.bronze);
        }

        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trophy_1 = new trophy_1();
                FragmentTransaction trophyFrag = getChildFragmentManager().beginTransaction();
                trophyFrag.add(R.id.test, trophy_1, "trophy_1").commit();
            }

        });

        silver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trophy_2 = new trophy_2();
                FragmentTransaction trophyFrag = getChildFragmentManager().beginTransaction();
                trophyFrag.add(R.id.test, trophy_2, "trophy_2").commit();
            }

        });

        bronze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trophy_3 = new trophy_3();
                FragmentTransaction trophyFrag = getChildFragmentManager().beginTransaction();
                trophyFrag.add(R.id.test, trophy_3, "trophy_3").commit();

            }

        });

        gold_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trophy_4 = new trophy_4();
                FragmentTransaction trophyFrag = getChildFragmentManager().beginTransaction();
                trophyFrag.add(R.id.test, trophy_4, "trophy_4").commit();

            }

        });

        silver_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trophy_5 = new trophy_5();
                FragmentTransaction trophyFrag = getChildFragmentManager().beginTransaction();
                trophyFrag.add(R.id.test, trophy_5, "trophy_5").commit();

            }

        });

        bronze_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trophy_6 = new trophy_6();
                FragmentTransaction trophyFrag = getChildFragmentManager().beginTransaction();
                trophyFrag.add(R.id.test, trophy_6, "trophy_6").commit();
            }

        });


        gold_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trophy_7 = new trophy_7();
                FragmentTransaction trophyFrag = getChildFragmentManager().beginTransaction();
                trophyFrag.add(R.id.test, trophy_7, "trophy_7").commit();

            }

        });

        silver_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trophy_8 = new trophy_8();
                FragmentTransaction trophyFrag = getChildFragmentManager().beginTransaction();
                trophyFrag.add(R.id.test, trophy_8, "trophy_8").commit();

            }

        });

        bronze_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trophy_9 = new trophy_9();
                FragmentTransaction trophyFrag = getChildFragmentManager().beginTransaction();
                trophyFrag.add(R.id.test, trophy_9, "trophy_9").commit();

            }

        });


        return rootView;
    }
}
