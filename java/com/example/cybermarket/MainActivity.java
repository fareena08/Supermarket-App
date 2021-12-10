package com.example.cybermarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cybermarket.adapter.CategoryAdapter;
import com.example.cybermarket.adapter.HotProductAdapter;
import com.example.cybermarket.adapter.RecentlyViewedAdapter;
import com.example.cybermarket.model.Category;
import com.example.cybermarket.model.HotProducts;
import com.example.cybermarket.model.RecentlyViewed;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView hotProductRecyclerView, categoryRecyclerView, recentlyViewedRecyclerView;

    HotProductAdapter hotProductAdapter;
    List<HotProducts> hotProductsList;

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    RecentlyViewedAdapter recentlyViewedAdapter;
    List<RecentlyViewed> recentlyViewedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hotProductRecyclerView = findViewById(R.id.recycler_hotproduct);
        categoryRecyclerView = findViewById(R.id.recycler_category);
        recentlyViewedRecyclerView = findViewById(R.id.recycler_recentlyview);

        //adding data to model (hot product)
        hotProductsList = new ArrayList<>();
        hotProductsList.add(new HotProducts(1, R.drawable.hp_nips));
        hotProductsList.add(new HotProducts(2, R.drawable.hp_nips));
        hotProductsList.add(new HotProducts(3, R.drawable.hp_nips));
        hotProductsList.add(new HotProducts(4, R.drawable.hp_nips));
        hotProductsList.add(new HotProducts(5, R.drawable.hp_nips));
        hotProductsList.add(new HotProducts(6, R.drawable.hp_nips));

        //adding data to model (category)
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, R.drawable.hp_nips));
        categoryList.add(new Category(2, R.drawable.hp_nips));
        categoryList.add(new Category(3, R.drawable.hp_nips));
        categoryList.add(new Category(4, R.drawable.hp_nips));
        categoryList.add(new Category(5, R.drawable.hp_nips));

        //adding data to model (recently viewed item)
        recentlyViewedList = new ArrayList<>();
        recentlyViewedList.add(new RecentlyViewed("Watermelon", "Watermelon has high water content and also provides some fiber.", "₹ 80", "1", "KG", R.drawable.bg));



        setHotProductRecyclerView(hotProductsList);
        setCategoryRecyclerView(categoryList);
        setRecentlyViewedRecycler(recentlyViewedList);
    }

    private void setHotProductRecyclerView(List<HotProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        hotProductRecyclerView.setLayoutManager(layoutManager);
        hotProductAdapter = new HotProductAdapter(this, dataList);
        hotProductRecyclerView.setAdapter(hotProductAdapter);
    }

    private void setCategoryRecyclerView(List<Category> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }
    private void setRecentlyViewedRecycler(List<RecentlyViewed> recentlyViewedDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recentlyViewedRecyclerView.setLayoutManager(layoutManager);
        recentlyViewedAdapter = new RecentlyViewedAdapter(this,recentlyViewedDataList);
        recentlyViewedRecyclerView.setAdapter(recentlyViewedAdapter);
    }
}