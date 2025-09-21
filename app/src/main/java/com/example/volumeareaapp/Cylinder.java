package com.example.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cylinder extends AppCompatActivity {
EditText cylinder_radius,cylinder_height;
TextView title , Result;
Button Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylinder_radius = findViewById(R.id.editText);
        title = findViewById(R.id.textView_cylinder);
        Result = findViewById(R.id.textView3);
        cylinder_height = findViewById(R.id.height);
        Btn = findViewById(R.id.Btn);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cylinder_radius.getText().toString();
                String height = cylinder_height.getText().toString();
                int r= Integer.parseInt(radius);
                int h = Integer.parseInt(height);

                    double volume = 3.16159 * r * r * h;

                Result.setText("Volume: " + volume);

            }
        });



    }
}