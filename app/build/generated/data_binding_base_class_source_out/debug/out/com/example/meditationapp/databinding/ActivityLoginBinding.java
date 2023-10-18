// Generated by view binder compiler. Do not edit!
package com.example.meditationapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.meditationapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final EditText loginEmail;

  @NonNull
  public final EditText loginPassword;

  @NonNull
  public final TextView signupRedirectText;

  @NonNull
  public final TextView textView5;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull Button loginButton,
      @NonNull EditText loginEmail, @NonNull EditText loginPassword,
      @NonNull TextView signupRedirectText, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.loginButton = loginButton;
    this.loginEmail = loginEmail;
    this.loginPassword = loginPassword;
    this.signupRedirectText = signupRedirectText;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.login_button;
      Button loginButton = rootView.findViewById(id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.login_email;
      EditText loginEmail = rootView.findViewById(id);
      if (loginEmail == null) {
        break missingId;
      }

      id = R.id.login_password;
      EditText loginPassword = rootView.findViewById(id);
      if (loginPassword == null) {
        break missingId;
      }

      id = R.id.signupRedirectText;
      TextView signupRedirectText = rootView.findViewById(id);
      if (signupRedirectText == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, loginButton, loginEmail,
          loginPassword, signupRedirectText, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
