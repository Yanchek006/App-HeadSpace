// Generated by view binder compiler. Do not edit!
package com.example.meditationapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.meditationapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import soup.neumorphism.NeumorphCardView;

public final class ListviewLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView frequency;

  @NonNull
  public final TextView headerTitle;

  @NonNull
  public final NeumorphCardView morningMeditation;

  private ListviewLayoutBinding(@NonNull LinearLayout rootView, @NonNull TextView description,
      @NonNull TextView frequency, @NonNull TextView headerTitle,
      @NonNull NeumorphCardView morningMeditation) {
    this.rootView = rootView;
    this.description = description;
    this.frequency = frequency;
    this.headerTitle = headerTitle;
    this.morningMeditation = morningMeditation;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListviewLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListviewLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.listview_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListviewLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.description;
      TextView description = rootView.findViewById(id);
      if (description == null) {
        break missingId;
      }

      id = R.id.frequency;
      TextView frequency = rootView.findViewById(id);
      if (frequency == null) {
        break missingId;
      }

      id = R.id.header_title;
      TextView headerTitle = rootView.findViewById(id);
      if (headerTitle == null) {
        break missingId;
      }

      id = R.id.morningMeditation;
      NeumorphCardView morningMeditation = rootView.findViewById(id);
      if (morningMeditation == null) {
        break missingId;
      }

      return new ListviewLayoutBinding((LinearLayout) rootView, description, frequency, headerTitle,
          morningMeditation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
