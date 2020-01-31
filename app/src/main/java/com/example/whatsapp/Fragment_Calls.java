package com.example.whatsapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Fragment_Calls extends Fragment {
    private static final String ARG_Name = "name";
    private static final String ARG_Id_Img = "id";

    private ArrayList<String> names;
    private ArrayList<Integer> images;

    public Fragment_Calls() {
        // Required empty public constructor
    }
    public static Fragment_Calls newInstance(ArrayList<String> names, ArrayList<Integer> images) {
        Fragment_Calls fragment = new Fragment_Calls();
        Bundle args = new Bundle();
        args.putStringArrayList(ARG_Name, names);
        args.putIntegerArrayList(ARG_Id_Img, images);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            names = getArguments().getStringArrayList(ARG_Name);
            images = getArguments().getIntegerArrayList(ARG_Id_Img);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment__calls, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rv = view.findViewById(R.id.rv_calls);
        RecyclerAdapter_calls adapter_calls = new RecyclerAdapter_calls(names,images);
        rv.setAdapter(adapter_calls);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
       // rv.setHasFixedSize(true);
    }
}
