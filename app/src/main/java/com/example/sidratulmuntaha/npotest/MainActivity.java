package com.example.sidratulmuntaha.npotest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.sidratulmuntaha.npotest.View.MyAdapter;
import com.example.sidratulmuntaha.npotest.View.ViewAdapter;
import com.example.sidratulmuntaha.npotest.model.DataObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataObject> dataArray;

    //    private ViewAdapter itemAdapter;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataArray = new ArrayList<>();

//        dataArray.add(new DataObject("hero", "wil come", "24-4-2019","R.mipmap.ic_launcher_round"));
//        dataArray.add(new DataObject("movie", "wil come", "25-4-2019","R.mipmap.ic_launcher_round"));
//        dataArray.add(new DataObject("movie2", "wil come", "26-4-2019","R.mipmap.ic_launcher_round"));
//        dataArray.add(new DataObject("movie3", "wil come", "27-4-2019","R.mipmap.ic_launcher_round"));

        for (int i = 0; i < 10; i++) {
             DataObject listItem = new DataObject(
                     "moviename"+ (i+1),
                     "will come soon",
                     "24-4-92",
                     "R.mipmap.ic_launcher_round"
             );
            dataArray.add(listItem);
        }

//        itemAdapter = new ViewAdapter(this, dataArray);

        myAdapter = new MyAdapter(this, dataArray);
        recyclerView.setAdapter(myAdapter);
    }

}
