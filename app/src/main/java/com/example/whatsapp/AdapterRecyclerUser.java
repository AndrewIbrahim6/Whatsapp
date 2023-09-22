package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.whatsapp.databinding.ItemUsersBinding;

import java.util.ArrayList;

public class AdapterRecyclerUser extends RecyclerView.Adapter<AdapterRecyclerUser.Holder> {


    private ArrayList<ModelUser> list;

    public void setList(ArrayList<ModelUser> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemUsersBinding binding = ItemUsersBinding.inflate(LayoutInflater
                .from(parent.getContext()),parent,false);
        return new Holder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list == null ?0 : list.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        ItemUsersBinding binding;
        public Holder(ItemUsersBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(ModelUser user){
            binding.textName.setText(user.getName());
            Glide.with(binding.getRoot().getContext())
                    .load(user.getImage()).into(binding.imgUser);
        }
    }
}