package com.example.android.miwok.classes;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.classes.Word;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        nameTextView.setText(currentWord.getMiwokTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        numberTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.miwok_image);

        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            //The image view is not visible here
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
