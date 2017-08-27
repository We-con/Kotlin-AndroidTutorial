package com.example.lf_wannabe.recyclerviewwithheader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tutorial.mim.recyclerview_header.ex.ExAdapter;
import com.tutorial.mim.recyclerview_header.model.Item;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Item> list = new ArrayList<>();
    private ExAdapter mExAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setHasFixedSize(false);

        for(int i=0;i<100;i++){
            list.add(new Item(i+1));
        }

        mExAdapter = new ExAdapter(this, new Item(0));
        mExAdapter.setHeaderFlag(true);
        mExAdapter.setData(list);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mExAdapter);

    }
}
