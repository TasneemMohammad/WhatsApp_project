package com.example.whatsapp;

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
public class FragmentChat extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_Name = "name";
    private static final String ARG_Id = "id_img";
    // TODO: Rename and change types of parameters
    private ArrayList<String> name;
    private ArrayList<Integer> image;
    private OnFragmentInteractionListener mListener;

    public FragmentChat() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentChat newInstance(ArrayList<String> name, ArrayList<Integer> image) {
        FragmentChat fragment = new FragmentChat();
        Bundle args = new Bundle();
        args.putStringArrayList(ARG_Name, name);
        args.putIntegerArrayList(ARG_Id, image);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getStringArrayList(ARG_Name);
            image = getArguments().getIntegerArrayList(ARG_Id);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Inflate the layout for this fragment
        RecyclerView rv_chat = view.findViewById(R.id.rv_chat);
        RecyclerAdapter_Chat adapter = new RecyclerAdapter_Chat(image,name, new OnClickListenerRecycler() {
            @Override
            public void onClickListener(Chat c) {
            mListener.onFragmentInteraction(c);
            }
        });
        rv_chat.setAdapter(adapter);
        //   RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv_chat.setLayoutManager(new LinearLayoutManager(getActivity()));
        //rv.setHasFixedSize(true);
    }
    // TODO: Rename method, update argument and hook method into UI event
  /*  public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        } }
   */

    public void onAttach(Activity_Image context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener"); }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(Chat c);
    }
}
