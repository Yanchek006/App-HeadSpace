package com.example.meditationapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;


public class FrequencyFragment extends Fragment {


    public FrequencyFragment() {
        // Required empty public constructor
    }

    ArrayList<listview> headerdescription;
    ListView listView;
    listAdapter listAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frequency, container, false);

        headerdescription = new ArrayList<>();
       new Thread(new Runnable() {
           @Override
           public void run() {
               Log.i(TAG, "Thread Running: "+Thread.currentThread().getId());

               headerdescription.add(new listview("Устойчивость к стрессу","Спокойно и ясно мыслить в ситуациях любой сложности.", "528HZ",R.raw.mini_relaxation_guided_mixdown));
               headerdescription.add(new listview("Точка спокойствия","Открыть позицию, в которой всегда будет баланс и устойчивость. ", "428HZ",R.raw.awareness_overthinking_guided_mixdown));
               headerdescription.add(new listview("Стабильная концентрация","Сосредоточься на важном и избавься от навязчивых мыслей. ", "828HZ",R.raw.om_chanting_mixdown));
               headerdescription.add(new listview("Гормоны счастья","Научиться чувствовать радость и благодарность от простых вещей. ", "788HZ",R.raw.grateful_affirmations_mixdown));
               headerdescription.add(new listview("Любовь к себе","Позаботиться о самом близком человеке в своей жизни. ", "328HZ",R.raw.alphamale_affirmations));
               headerdescription.add(new listview("Ясность сознания","Освободиться от навязчивых мыслей и запутанных эмоций. ", "228HZ",R.raw.guided_meditation_girl));
               headerdescription.add(new listview("Подзарядка днем","Сделать перерыв, чтобы восстановить силы, фокус и ясность мыслей. ", "128HZ",R.raw.mini_break_work_mixdown));
               headerdescription.add(new listview("Продуктивность без стресса","Научиться работать без переживаний, быстро и качественно. ", "128HZ",R.raw.waves_sound_mixdown));

           }
       }).start();
         listAdapter = new listAdapter(getContext(), headerdescription);

        listView = view.findViewById(R.id.listMode);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {




                switch (position)
                {
                    case 1:
                    case 6:
                    case 5:
                    case 4:
                    case 3: {
                        listview abc = headerdescription.get(position);
                        MusicPlayerFragment musicPlayerFragment = new MusicPlayerFragment();
                        Bundle bundle = new Bundle();
                        bundle.putInt("backgroundColor", Color.parseColor("#FF8A00"));
                        bundle.putInt("lightShadow", Color.parseColor("#FFA63D"));
                        bundle.putInt("darkShadow", Color.parseColor("#33000000"));
                        bundle.putInt("visualizer", Color.parseColor("#FF8A00"));
                        bundle.putInt("music",abc.getAudioresrc());
                        bundle.putBoolean("check",true);
                        musicPlayerFragment.setArguments(bundle);

                        FragmentTransaction fragmentTransaction = getActivity()
                                .getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fadein,R.anim.fadeout,R.anim.fadein,R.anim.fadeout).addToBackStack(null);
                        fragmentTransaction.replace(R.id.frame, musicPlayerFragment);
                        fragmentTransaction.commit();
                        break;

                    }
                    case 2:
                    case 9:
                    case 7: {
                        listview abc = headerdescription.get(position);
                        MusicPlayerFragment musicPlayerFragment = new MusicPlayerFragment();
                        Bundle bundle = new Bundle();
                        bundle.putInt("backgroundColor", Color.parseColor("#FF8A00"));
                        bundle.putInt("lightShadow", Color.parseColor("#FFA63D"));
                        bundle.putInt("darkShadow", Color.parseColor("#33000000"));
                        bundle.putInt("visualizer", Color.parseColor("#FF8A00"));
                        bundle.putInt("music",abc.getAudioresrc());
                        bundle.putBoolean("check",false);
                        musicPlayerFragment.setArguments(bundle);

                        FragmentTransaction fragmentTransaction = getActivity()
                                .getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fadein,R.anim.fadeout,R.anim.fadein,R.anim.fadeout).addToBackStack(null);
                        fragmentTransaction.replace(R.id.frame, musicPlayerFragment);
                        fragmentTransaction.commit();
                        break;

                    }
                    default:
                    {



                            MusicPlayerFragment musicPlayerFragment = new MusicPlayerFragment();
                            Bundle bundle = new Bundle();
                            bundle.putInt("backgroundColor", Color.parseColor("#FF8A00"));
                            bundle.putInt("lightShadow", Color.parseColor("#FFA63D"));
                            bundle.putInt("darkShadow", Color.parseColor("#33000000"));
                            bundle.putInt("visualizer", Color.parseColor("#FF8A00"));
                            bundle.putInt("music",R.raw.guided_meditation_girl);
                            bundle.putBoolean("check",true);
                            musicPlayerFragment.setArguments(bundle);

                            FragmentTransaction fragmentTransaction = getActivity()
                                    .getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fadein,R.anim.fadeout,R.anim.fadein,R.anim.fadeout).addToBackStack(null);
                            fragmentTransaction.replace(R.id.frame, musicPlayerFragment);
                            fragmentTransaction.commit();

                        break;

                    }

                }
            }
        });


        return view;
    }


}