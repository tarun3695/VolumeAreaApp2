package com.example.volumeareaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1 Adapter view:  grid views
    GridView gridView;

// 2 Data source : Arraylist<Shape>
  ArrayList<Shape> shapeArrayList;


// 3 - Adapter: MyCustomAdapter

    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);


        shapeArrayList = new ArrayList<>();

        Shape s1 = new Shape(R.drawable.sphere , "Sphere");
        Shape s2 = new Shape(R.drawable.cylinder ,"cylinder");
        Shape s3 = new Shape(R.drawable.cube ,"Cube");
        Shape s4 = new Shape(R.drawable.prism ,"Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);


        adapter = new MyCustomAdapter(shapeArrayList ,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext() , Sphere.class );
                Intent I = new Intent(getApplicationContext() , Cylinder.class);
                startActivity(i);
                startActivity(I);
            }
        });

    }
}