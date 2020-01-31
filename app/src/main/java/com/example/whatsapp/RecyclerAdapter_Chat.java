package com.example.whatsapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter_Chat extends RecyclerView.Adapter<RecyclerAdapter_Chat.ChatViewHolder> {
 ArrayList<String> name ;
  ArrayList<Integer> images;
    //Context c ;
 OnClickListenerRecycler listenerRecycler;

    public RecyclerAdapter_Chat(ArrayList<Integer> images, ArrayList<String> name, OnClickListenerRecycler listenerRecycler){
        this.listenerRecycler = listenerRecycler;
       this.name = name;
        this.images =images;
      //  Image = image;
    }
    @NonNull
     @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
  View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_chat_xml,null,false);
   ChatViewHolder viewHolder = new ChatViewHolder(v);
   return viewHolder; // return new ChatViewHolder;
     }
     @Override
     public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
       // replace obj with this :
     holder.img_chat.setImageResource(images.get(position)); // important ..
     holder.tv_chat.setText(name.get(position));
     }
     @Override
     public int getItemCount() {
         return images.size();
     }

     class ChatViewHolder extends RecyclerView.ViewHolder{
        TextView tv_chat ;
      CircleImageView img_chat ;
       Chat c ;
     //  int idImg;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
          tv_chat = itemView.findViewById(R.id.tv_chat);
            img_chat = itemView.findViewById(R.id.profile_image_chat);
            itemView.setOnClickListener(
                    new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  listenerRecycler.onClickListener(c);
                }
            });
            }
            }
            }