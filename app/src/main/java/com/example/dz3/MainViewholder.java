package com.example.dz3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewholder extends RecyclerView.ViewHolder {

    TextView textVie,textv;
    public MainViewholder(@NonNull View itemView) {
        super(itemView);
        textVie = itemView.findViewById(R.id.textViewName);
        textv= itemView.findViewById(R.id.textview2);
    }

    public void onBind(ItemModel data ) {
        textVie.setText(data.getName());
        textv.setText(data.getTitle());
    }
}
