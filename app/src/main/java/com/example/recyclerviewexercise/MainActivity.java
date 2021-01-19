package com.example.recyclerviewexercise;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = "AndroidExample";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Country> countries = getListData();
        this.recyclerView = (RecyclerView) this.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new CustomRecyclerViewAdapter(this, countries));

        // RecyclerView scroll vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private  List<Country> getListData() {
        List<Country> list = new ArrayList<Country>();
        Country vietnam = new Country("Iphone 5", "iphone", 98000000);
        Country usa = new Country("Iphone 6", "iphone10", 320000000);
        Country russia = new Country("Iphone 7", "iphone11", 142000000);
        Country autraylia = new Country("Iphone 8", "iphone12", 25000000);
        Country japan = new Country("Iphone 9", "iphone", 126000000);
        Country korea = new Country("Iphone X", "iphone10", 226000000);
        Country lao = new Country("Iphone 11", "iphone11", 158000000);
        Country thai = new Country("Iphone 12", "iphone12", 626000000);


        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(autraylia);
        list.add(japan);
        list.add(korea);
        list.add(lao);
        list.add(thai);

        return list;
    }


}
