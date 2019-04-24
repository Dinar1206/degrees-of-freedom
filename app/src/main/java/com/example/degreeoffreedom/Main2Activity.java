package com.example.degreeoffreedom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt = findViewById(R.id.txt);

        Intent intent = getIntent();

        Bundle bu = intent.getExtras();
        int finalNjoin = bu.getInt("joints");
        int finalNlink = bu.getInt("links");
        int finalm = bu.getInt("mo");
        int finals = bu.getInt("spher");
        int finalr = bu.getInt("rev");
        int finalu = bu.getInt("uni");

        txt.setText(finalm * (finalNjoin - 1 - finalNlink)+(finals*3+finalu*2+finalr*1));
    }
}
