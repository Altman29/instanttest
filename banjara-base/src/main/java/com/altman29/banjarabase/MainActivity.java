package com.altman29.banjarabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private MyAdapter mAdapter;
    private String[] data = new String[]{"aaaaaaa", "bbbbbbb", "ccccccc", "ddddddd", "eeeeeee", "fffffff", "ggggggg", "hhhhhhh", "iiiiiii", "jjjjjjj", "kkkkkkk", "lllllll", "mmmmmmm", "nnnnnnn", "ooooooo", "ppppppp", "qqqqqqq", "rrrrrrr", "sssssss", "ttttttt"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        //创建默认的线性LayoutManager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        mRecyclerView.setHasFixedSize(true);
        //创建并设置Adapter
        mAdapter = new MyAdapter(data);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("name", "details:" + data[position]);
                startActivity(intent);
            }
        });
    }
}
