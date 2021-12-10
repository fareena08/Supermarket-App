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

public class HotProductAdapter extends RecyclerView.Adapter<HotProductAdapter.HotProductViewHolder> {
    Context context;
    List<HotProducts> hotProductsList;

    public HotProductAdapter(Context context, List<HotProducts> discountedProductsList) {
        this.context = context;
        this.hotProductsList = discountedProductsList;
    }

    @NonNull
    @Override
    public HotProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hotproduct_row, parent, false);
        return new HotProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotProductViewHolder holder, int position) {
        holder.hotProductImageView.setImageResource(hotProductsList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return hotProductsList.size();
    }

    public class HotProductViewHolder extends RecyclerView.ViewHolder {
        ImageView hotProductImageView;

        public HotProductViewHolder(@NonNull View itemView) {
            super(itemView);

            hotProductImageView = itemView.findViewById(R.id.img_hotproduct);
        }
    }
}
