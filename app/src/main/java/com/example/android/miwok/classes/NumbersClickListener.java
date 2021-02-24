package com.example.android.miwok.classes;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class NumbersClickListener implements OnClickListener {

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
