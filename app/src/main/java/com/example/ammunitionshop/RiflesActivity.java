package com.example.ammunitionshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RiflesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rifles);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        TextView tx1 = findViewById(R.id.textView14);
        TextView tx2 = findViewById(R.id.textView15);


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на активность PistolsActivity
                Intent intent = new Intent(RiflesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("Товар куплен");
            }
        });


    }
}