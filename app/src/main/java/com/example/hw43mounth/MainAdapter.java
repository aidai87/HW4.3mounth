package com.example.hw43mounth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private ArrayList<String> list;

    public MainAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gogogle , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
      holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.TextView);
        }

        public void bind(String s) {
            textView.setText(s);
        }
    }
}
