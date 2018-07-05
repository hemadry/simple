package com.example.hemadry.project004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerRV;
    private List<Movie>movies = new ArrayList<>();
    private MovieAdepter adepter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerRV =findViewById(R.id.recyclerView);
        adepter= new MovieAdepter(this,Movielist.generateMovie());
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerRV.setLayoutManager(llm);
        recyclerRV.setAdapter(adepter);

    }
}
