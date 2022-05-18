package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
private NameAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        ArrayList<String> names=new ArrayList<>();
        names.add("Nurs");
        names.add("Madina");
        names.add("Talant");
        names.add("Maksat");
        names.add("Aibek");
        names.add("Sanjar");
        names.add("Bek");
        names.add("Aidai");
        names.add("Roza");
        names.add("Gulnara");
        names.add("Janara");
        adapter=new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}