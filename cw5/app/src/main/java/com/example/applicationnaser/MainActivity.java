package com.example.applicationnaser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.applicationnaser.MainActivity2;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText a = findViewById(R.id.EditText1);
        EditText b = findViewById(R.id.EditText2);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = a.getText().toString();
                int s = Integer.parseInt(b.getText().toString());
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("naser", x);
                intent.putExtra("name", s);

                startActivity(intent);
            }
        });
    }
}