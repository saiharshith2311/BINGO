package com.example.bingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w_i_n);
        String name=getIntent().getStringExtra("name");
        TextView t4=(TextView) findViewById(R.id.t4);
        t4.setText(name+" "+t4.getText());
    }
}
