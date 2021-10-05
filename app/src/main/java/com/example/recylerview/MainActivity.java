package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recv = (RecyclerView) findViewById(R.id.rcylv);

        recv.setLayoutManager(new LinearLayoutManager(this));

        String arr[] ={"C","C++","python","C#","java","R","new","okay","C","C++","python","C#","java","R","new","okay"};

        recv.setAdapter(new myAdaptar(arr));


    }
}