package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Activity_Image extends AppCompatActivity implements FragmentChat.OnFragmentInteractionListener {
  ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__image);
        img = (ImageView)findViewById(R.id.img_Act);
    }

    @Override
    public void onFragmentInteraction(Chat c) {
     img.setImageResource(c.getId());
    }
}
