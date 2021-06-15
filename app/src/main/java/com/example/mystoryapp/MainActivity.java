package com.example.mystoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //private static int SPLASH_TIME_OUT=4000;
    ListView l1;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1=findViewById(R.id.listview1);
        Resources res;
        res = getResources();
        String[] tStory=res.getStringArray(R.array.title_story);
        final String[] dStory=res.getStringArray(R.array.detail_story);
        adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, tStory);
        l1.setAdapter(adapter);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /* Activity 2 coding
                String detail=dStory[position];
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("story_name",detail);
                startActivity(i);*/
                //Activity 3 Coding
                Intent i=new Intent(MainActivity.this,MainActivity3.class);
                i.putExtra("key_position",position);
                startActivity(i);




            }
        });

    }
}