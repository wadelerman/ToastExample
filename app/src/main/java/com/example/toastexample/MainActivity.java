package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeText(this, "Toast onCreate", LENGTH_SHORT).show();
        final Button btnbb = findViewById(R.id.bb);
        btnbb.setOnClickListener(new
            View.OnClickListener() {
                @Override
            public void onClick(View view) {
                btnbb.setBackgroundColor(Color.MAGENTA);
            }
        });
    }

    public void onStart() {
        super.onStart();
        makeText(this, "Ini Toast onStart", LENGTH_SHORT).show();
    }
    public void onResume() {
        super.onResume();
        makeText(this, "Ini Toast onResume", LENGTH_SHORT).show();
    }
    public void onPause() {
        super.onPause();
        makeText(this, "Ini Toast onPause", LENGTH_SHORT).show();
    }
    public void onStop() {
        super.onStop();
        makeText(this, "Ini Toast onStop", LENGTH_SHORT).show();
    }
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Ini Toast OnDestroy", Toast.LENGTH_SHORT).show();
    }
}

