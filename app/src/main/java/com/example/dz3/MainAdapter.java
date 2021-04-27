package com.example.dz3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter  extends RecyclerView.Adapter<MainViewholder> {

    ArrayList <ItemModel> data  =  new ArrayList<ItemModel>();

    @NonNull
    @Override
    public MainViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =  inflater.inflate(R.layout.item_list,parent,false);
        return new MainViewholder(view);
    }

    public void addList(ArrayList<ItemModel> list){
        data = list;
        notifyDataSetChanged();
    }

    public void addModel(ItemModel model) {
        data.add(model);
        notifyDataSetChanged();
    }



    @Override
    public void onBindViewHolder(@NonNull MainViewholder holder, int position) {
    holder.onBind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
