package com.example.cybermarket.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cybermarket.R;
import com.example.cybermarket.model.HotProducts;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    Context context;
    List<HotProducts> hotProductsList;

    public MainAdapter(Context context, List<HotProducts> discountedProductsList) {
        this.context = context;
        this.hotProductsList = discountedProductsList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hotproduct_row, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.hotProductImageView.setImageResource(hotProductsList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return hotProductsList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        ImageView hotProductImageView;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            hotProductImageView = itemView.findViewById(R.id.img_hotproduct);
        }
    }
}
