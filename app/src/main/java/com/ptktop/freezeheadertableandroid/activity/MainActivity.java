package com.ptktop.freezeheadertableandroid.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ptktop.freezeheadertableandroid.R;
import com.ptktop.freezeheadertableandroid.adapter.LeftRecycleViewAdapter;
import com.ptktop.freezeheadertableandroid.adapter.RightRecycleViewAdapter;

import java.util.ArrayList;
import java.util.List;

/*********************
 * Created by PTKTOP *
 *********************/

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvLeft, rvRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLeft = findViewById(R.id.rvLeft);
        rvRight = findViewById(R.id.rvRight);

        rvLeft.setHasFixedSize(true);
        rvRight.setHasFixedSize(true);

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this);
        rvLeft.setLayoutManager(layoutManager1);
        rvRight.setLayoutManager(layoutManager2);

        LeftRecycleViewAdapter leftAdapter = new LeftRecycleViewAdapter(getData());
        RightRecycleViewAdapter rightAdapter = new RightRecycleViewAdapter(getData());
        rvLeft.setAdapter(leftAdapter);
        rvRight.setAdapter(rightAdapter);


        final RecyclerView.OnScrollListener[] scrollListeners = new RecyclerView.OnScrollListener[2];

        scrollListeners[0] = new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                rvRight.removeOnScrollListener(scrollListeners[1]);
                rvRight.scrollBy(dx, dy);
                rvRight.addOnScrollListener(scrollListeners[1]);
            }
        };
        scrollListeners[1] = new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                rvLeft.removeOnScrollListener(scrollListeners[0]);
                rvLeft.scrollBy(dx, dy);
                rvLeft.addOnScrollListener(scrollListeners[0]);
            }
        };
        rvLeft.addOnScrollListener(scrollListeners[0]);
        rvRight.addOnScrollListener(scrollListeners[1]);
    }

    private List<String> getData() {
        List<String> listData = new ArrayList<>();
        listData.clear();
        for (int i = 0; i < 100; i++) {
            listData.add(i + "");
        }
        return listData;
    }
}
