package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView rview;
    ArrayList<String> colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.Colors)));

        rview = findViewById(R.id.rview);
        ColorAdapter adapter = new ColorAdapter(getLayoutInflater());
        adapter.submitList(colors);
        rview.setLayoutManager(new LinearLayoutManager(this));
        rview.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rview.setAdapter(adapter);

    }

}