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

public class Sphere extends AppCompatActivity {
 EditText sphere_radius;
 TextView title,Result;
 Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphere_radius = findViewById(R.id.editText_sphere);
        title = findViewById(R.id.textView2);
        Result = findViewById(R.id.textView_result);
         btn = findViewById(R.id.btn1);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String radius = sphere_radius.getText().toString();
                 int r= Integer.parseInt(radius);

                 double volume = (4/3) * 3.16159 * r*r*r;


                 Result.setText("V = "+volume+" m^3");
             }
         });




    }
}