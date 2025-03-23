package com.example.multiactivities;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init02();
    }
    private void init02() {
        ImageView imageView = findViewById(R.id.flower);
        imageView.setOnClickListener(v->{
            Intent intent = new Intent(this, TestActivity.class);
            startActivity(intent);
        });
    }
}



