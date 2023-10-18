package com.example.meditationapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import org.jetbrains.annotations.NotNull;

import soup.neumorphism.NeumorphImageView;

public class ProfileFragment extends Fragment {
    ImageView emailbtn;
    NeumorphImageView achievement_1, achievement_2, achievement_3;
    ProgressBar progressBar;
    TextView progress_txt;
    int progress;
    SharedPreferences preferences;

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("ProgressOfUser", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull @NotNull String requestKey, @NonNull @NotNull Bundle result) {
                editor.putInt("progress", result.getInt("progress"));
                editor.apply();
                progress = result.getInt("progress");
            }
        });

    }
    SharedPreferences.Editor editor;
    public ProfileFragment() {
        // Required empty public constructor
    }
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        emailbtn = view.findViewById(R.id.emailbtn);
        achievement_1 = view.findViewById(R.id.achievement_1);
        achievement_2 = view.findViewById(R.id.achievement_2);
        achievement_3 = view.findViewById(R.id.achievement_3);
        progress_txt = view.findViewById(R.id.progress_txt);
        progressBar = view.findViewById(R.id.progressBar);

        preferences = getActivity().getSharedPreferences("Progress", Context.MODE_PRIVATE);
        editor = preferences.edit();
        editor.apply();
        progress = preferences.getInt("progress", 0);

        progressBar.setProgress(progress);
        progressBar.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);
        progressBar.invalidate();
        progress_txt.setText("Ваш прогресс : " + progress);
        progress_txt.setVisibility(View.GONE);
        progress_txt.setVisibility(View.VISIBLE);
        progress_txt.invalidate();

        if (progress >= 5) {
            achievement_1.setBackgroundColor(Color.parseColor("#ffffff"));
        }
        if (progress >= 50) {
            achievement_2.setBackgroundColor(Color.parseColor("#ffffff"));
        }
        if (progress >= 100) {
            achievement_3.setBackgroundColor(Color.parseColor("#ffffff"));
        }

        achievement_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress < 5) {
                    Toast.makeText(getContext(), "Your progress should be 5", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getContext(), AchievementActivity.class);
                    intent.putExtra("award", R.raw.award1);

                    startActivity(intent);
                }
            }
        });

        achievement_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress < 50) {
                    Toast.makeText(getContext(), "Your progress should be 50", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getContext(), AchievementActivity.class);
                    intent.putExtra("award", R.raw.award2);
                    startActivity(intent);

                }

            }
        });


        achievement_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress < 100) {
                    Toast.makeText(getContext(), "Your progress should be 100", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getContext(), AchievementActivity.class);
                    intent.putExtra("award", R.raw.award3);
                    startActivity(intent);
                }
            }
        });


        emailbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                composeEmail();
            }
        });
        return view;
    }
    public void composeEmail() {
        String[] addresses = {""};
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("@+id/email");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}