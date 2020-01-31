package com.example.whatsapp;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter_calls extends RecyclerView.Adapter<RecyclerAdapter_calls.CallsViewHolder> {

    ArrayList<String> names ;
    ArrayList<Integer> images ;

    public RecyclerAdapter_calls(ArrayList<String> names, ArrayList<Integer> images) {
        this.names = names;
        this.images = images;
    }
    @NonNull
     @Override
     public CallsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_calls,null,false);
        return new CallsViewHolder(v);
     }
     @Override
     public void onBindViewHolder(@NonNull CallsViewHolder holder, int position) {
      holder.img_person.setImageResource(images.get(position));
      holder.tv_name.setText(names.get(position));
     }
     @Override
     public int getItemCount() {
         return names.size();
     }
     class CallsViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name ;
        CircleImageView img_person , img_call;

         public CallsViewHolder(@NonNull View itemView) {
             super(itemView);
             tv_name = itemView.findViewById(R.id.tv_name);
             img_person = itemView.findViewById(R.id.person_image_call);
             img_call = itemView.findViewById(R.id.icon_phone_image);
         }
     }
}
