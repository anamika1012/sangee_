package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class signup_as extends AppCompatActivity {

    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_as);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(v -> {
        Intent intent=new Intent(this, SignUp.class);
        startActivity(intent);
    });
}
}