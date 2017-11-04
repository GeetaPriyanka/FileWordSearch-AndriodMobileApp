package com.example.homework_3;

/*
HomeWork 03
Created by
        Sai Vikhyat Parepalli
        Geeta Priyanka Janapareddy*/

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class DisplayLines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listline);


        ArrayList<File> lines;
        final ArrayList<String> input;


        ListView listView = (ListView) findViewById(R.id.listView);


        if (getIntent().getExtras() != null) {
            lines = (ArrayList<File>) getIntent().getExtras().get("key");
            input = (ArrayList<String>) getIntent().getExtras().get("input");
            listView.setAdapter(new CustomAdapter2(this, lines, input));
        }

        findViewById(R.id.buttonFinish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayLines.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
