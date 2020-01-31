package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter_Name extends RecyclerView.Adapter<RecyclerAdapter_Name.NameViewHoler> {
ArrayList<String> names ;

    public RecyclerAdapter_Name(ArrayList<String> names) {
        this.names = names;
    }
    @NonNull
    @Override
    public NameViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_chat_xml,null,false);
        return new NameViewHoler(v);
    }
    @Override
    public void onBindViewHolder(@NonNull NameViewHoler holder, int position) {
        holder.tv_name.setText(names.get(position));
    }
    @Override
    public int getItemCount() {
        return names.size();
    }

    public class NameViewHoler extends RecyclerView.ViewHolder{
            TextView tv_name ;
          //  Chat c ;

            public NameViewHoler(@NonNull View itemView) {
                super(itemView);
                  tv_name = itemView.findViewById(R.id.tv_chat);
            }
        }

    }

