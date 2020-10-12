package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView = null;
    RecyclerViewAdapter mAdapter = null;
    ArrayList<RecyclerViewItem> mList;

    private Drawable mImageDrawable;
    private String mMainText;
    private String mSubText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        mList = new ArrayList<>();

        mAdapter = new RecyclerViewAdapter(mList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        mImageDrawable = ResourcesCompat.getDrawable(getResources(), R.drawable.crocus, null);
        mMainText = "Crocus";
        mSubText = "www.crocus.co.kr";

        addItem(mImageDrawable, mMainText + " - 1",  mSubText);
        addItem(mImageDrawable, mMainText + " - 2",  mSubText);
        addItem(mImageDrawable, mMainText + " - 3",  mSubText);
        addItem(mImageDrawable, mMainText + " - 4",  mSubText);
        addItem(mImageDrawable, mMainText + " - 5",  mSubText);

        mAdapter.notifyDataSetChanged();
    }

    private void addItem(Drawable icon, String mainText, String subText) {
        RecyclerViewItem item = new RecyclerViewItem();

        item.setIcon(icon);
        item.setMainTitle(mainText);
        item.setSubTitle(subText);

        mList.add(item);
    }
}
