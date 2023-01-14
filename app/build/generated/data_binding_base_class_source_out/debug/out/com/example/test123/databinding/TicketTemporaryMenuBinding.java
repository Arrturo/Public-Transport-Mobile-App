// Generated by view binder compiler. Do not edit!
package com.example.test123.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.test123.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TicketTemporaryMenuBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button doba1;

  @NonNull
  public final Button doba3;

  @NonNull
  public final Button doby2;

  @NonNull
  public final LinearLayout header;

  private TicketTemporaryMenuBinding(@NonNull LinearLayout rootView, @NonNull Button doba1,
      @NonNull Button doba3, @NonNull Button doby2, @NonNull LinearLayout header) {
    this.rootView = rootView;
    this.doba1 = doba1;
    this.doba3 = doba3;
    this.doby2 = doby2;
    this.header = header;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TicketTemporaryMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TicketTemporaryMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ticket_temporary_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TicketTemporaryMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.doba_1;
      Button doba1 = ViewBindings.findChildViewById(rootView, id);
      if (doba1 == null) {
        break missingId;
      }

      id = R.id.doba_3;
      Button doba3 = ViewBindings.findChildViewById(rootView, id);
      if (doba3 == null) {
        break missingId;
      }

      id = R.id.doby_2;
      Button doby2 = ViewBindings.findChildViewById(rootView, id);
      if (doby2 == null) {
        break missingId;
      }

      LinearLayout header = (LinearLayout) rootView;

      return new TicketTemporaryMenuBinding((LinearLayout) rootView, doba1, doba3, doby2, header);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}