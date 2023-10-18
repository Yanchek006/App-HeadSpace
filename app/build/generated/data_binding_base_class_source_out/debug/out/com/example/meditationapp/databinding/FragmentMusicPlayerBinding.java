// Generated by view binder compiler. Do not edit!
package com.example.meditationapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.meditationapp.R;
import com.gauravk.audiovisualizer.visualizer.WaveVisualizer;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import soup.neumorphism.NeumorphButton;

public final class FragmentMusicPlayerBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final NeumorphButton MeditateButton;

  @NonNull
  public final WaveVisualizer bar;

  @NonNull
  public final TextView descriptionMeditate;

  @NonNull
  public final TextView descriptionMeditate1;

  @NonNull
  public final TextView headerForMeditate;

  @NonNull
  public final ConstraintLayout meditateBackground;

  @NonNull
  public final EditText minutesInput;

  @NonNull
  public final Button setButton;

  @NonNull
  public final View view;

  private FragmentMusicPlayerBinding(@NonNull ScrollView rootView,
      @NonNull NeumorphButton MeditateButton, @NonNull WaveVisualizer bar,
      @NonNull TextView descriptionMeditate, @NonNull TextView descriptionMeditate1,
      @NonNull TextView headerForMeditate, @NonNull ConstraintLayout meditateBackground,
      @NonNull EditText minutesInput, @NonNull Button setButton, @NonNull View view) {
    this.rootView = rootView;
    this.MeditateButton = MeditateButton;
    this.bar = bar;
    this.descriptionMeditate = descriptionMeditate;
    this.descriptionMeditate1 = descriptionMeditate1;
    this.headerForMeditate = headerForMeditate;
    this.meditateBackground = meditateBackground;
    this.minutesInput = minutesInput;
    this.setButton = setButton;
    this.view = view;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMusicPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMusicPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_music_player, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMusicPlayerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.MeditateButton;
      NeumorphButton MeditateButton = rootView.findViewById(id);
      if (MeditateButton == null) {
        break missingId;
      }

      id = R.id.bar;
      WaveVisualizer bar = rootView.findViewById(id);
      if (bar == null) {
        break missingId;
      }

      id = R.id.description_meditate;
      TextView descriptionMeditate = rootView.findViewById(id);
      if (descriptionMeditate == null) {
        break missingId;
      }

      id = R.id.description_meditate1;
      TextView descriptionMeditate1 = rootView.findViewById(id);
      if (descriptionMeditate1 == null) {
        break missingId;
      }

      id = R.id.header_for_meditate;
      TextView headerForMeditate = rootView.findViewById(id);
      if (headerForMeditate == null) {
        break missingId;
      }

      id = R.id.meditate_background;
      ConstraintLayout meditateBackground = rootView.findViewById(id);
      if (meditateBackground == null) {
        break missingId;
      }

      id = R.id.minutes_input;
      EditText minutesInput = rootView.findViewById(id);
      if (minutesInput == null) {
        break missingId;
      }

      id = R.id.set_button;
      Button setButton = rootView.findViewById(id);
      if (setButton == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new FragmentMusicPlayerBinding((ScrollView) rootView, MeditateButton, bar,
          descriptionMeditate, descriptionMeditate1, headerForMeditate, meditateBackground,
          minutesInput, setButton, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
