package com.example.ammunitionshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Находим кнопки по их ID
        Button pistolsButton = findViewById(R.id.pistols_button);
        Button shotgunsButton = findViewById(R.id.shotguns_button);
        Button riflesButton = findViewById(R.id.rifles_button);

        // Устанавливаем обработчик нажатия для каждой кнопки
        pistolsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на активность PistolsActivity
                Intent intent = new Intent(MainActivity.this, PistolsActivity.class);
                startActivity(intent);
            }
        });

        shotgunsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на активность ShotgunsActivity
                Intent intent = new Intent(MainActivity.this, ShotgunsActivity.class);
                startActivity(intent);
            }
        });

        riflesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на активность RiflesActivity
                Intent intent = new Intent(MainActivity.this, RiflesActivity.class);
                startActivity(intent);
            }
        });
    }
}
