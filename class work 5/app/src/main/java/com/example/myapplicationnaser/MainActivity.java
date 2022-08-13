package com.example.myapplicationnaser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.EditText1);
        EditText age = findViewById(R.id.EditText2);
        Button fly = findViewById(R.id.button);

        fly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        String item = name.getText().toString();
        int item2 = Integer.parseInt(age.getText().toString());
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("naser", item);
                intent.putExtra("bader",item2);

                startActivity(intent);


            }
        });






    }
}