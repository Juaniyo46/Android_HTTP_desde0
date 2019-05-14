package com.example.ejer_http_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button getBtn;

    private TextView id;
    private TextView title;
    private TextView body;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getBtn = findViewById(R.id.getBtn);

        id = findViewById(R.id.id);
        title = findViewById(R.id.title);
        body = findViewById(R.id.body);
    }
}
