package com.example.dz4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainWiewHolder> {

    List<TitleModel> list;
    Context context;

    public MainAdapter(List<TitleModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MainWiewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).
            inflate(R.layout.item_recucleview,parent,false);
        return new MainWiewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainWiewHolder holder, int position) {
        TitleModel titleModel = list.get(position);
        holder.txtTitle.setText(titleModel.getTitle());

    }



    @Override
    public int getItemCount() {
        return list.size();
    }
}
    class MainWiewHolder extends  RecyclerView.ViewHolder{
        TextView txtTitle;


        public MainWiewHolder(@NonNull View itemView) {
            super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        }
    }
