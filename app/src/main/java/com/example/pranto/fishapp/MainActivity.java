package com.example.pranto.fishapp;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static ListAdapter adapter;
    ArrayList<String> dataModels;
    String[] mobileArray = {"Shada Carp","Kala Carp","Nola Carp","Chikna Carp",
            "Motka Carp","Nerd Carp","Bodox Carp","Brilliant Carp","Navid Carp","The Ultimate Nigga Carp",
    "Sherlock Carp","Carp 007","Glory Glory Carp United","Premik Carp","Devdas Carp","BatCarp"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=(ListView)findViewById(R.id.lview);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listshowactivity, mobileArray);
        listview.setAdapter(adapter);





    }
}
