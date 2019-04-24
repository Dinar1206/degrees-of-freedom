package com.example.degreeoffreedom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view) {
        EditText joints = findViewById(R.id.joints);
        EditText links = findViewById(R.id.links);
        EditText mo = findViewById(R.id.m);
        EditText spher = findViewById(R.id.spher);
        EditText rev = findViewById(R.id.rev);
        EditText uni = findViewById(R.id.uni);

        String Njoin = joints.getText().toString();
        int finalNjoin=Integer.parseInt(Njoin);
        String Nlink = links.getText().toString();
        int finalNlink=Integer.parseInt(Nlink);
        String m = mo.getText().toString();
        int finalm=Integer.parseInt(m);
        String s = spher.getText().toString();
        int finals=Integer.parseInt(s);
        String r = rev.getText().toString();
        int finalr=Integer.parseInt(r);
        String u = uni.getText().toString();
        int finalu=Integer.parseInt(u);
        Intent intent = new Intent(this, Main2Activity.class);

        Bundle bundle = new Bundle();
        bundle.putInt("joints", finalNjoin);
        bundle.putInt("links", finalNlink);
        bundle.putInt("mo", finalm);
        bundle.putInt("spher", finals);
        bundle.putInt("rev", finalr);
        bundle.putInt("uni", finalu);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
