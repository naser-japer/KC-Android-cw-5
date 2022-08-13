package com.example.myapplicationnaser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nam = findViewById(R.id.textView6);
        TextView year = findViewById(R.id.textView7);

        Bundle bundle = getIntent().getExtras();

String eye = bundle.getString("naser");
nam.setText(eye);

int blue = bundle.getInt("bader");
year.setText(String.valueOf(blue));



    }
}