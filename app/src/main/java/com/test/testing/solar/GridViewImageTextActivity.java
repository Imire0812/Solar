package com.test.testing.solar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

@SuppressLint("Registered")
public class GridViewImageTextActivity extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = {
            "Планеты", "Космические тела", "Космос", "Солнце", "Викторина", "О нас",
            "Планеты", "Космические тела", "Космос", "Солнце", "Викторина", "О нас",
            "Планеты", "Космические тела", "Космос", "Солнце", "Викторина", "О нас",

    } ;
    int[] gridViewImageId = {

            R.drawable.planets, R.drawable.spacebodies, R.drawable.space, R.drawable.sun, R.drawable.victorina, R.drawable.users,
            R.drawable.planets, R.drawable.spacebodies, R.drawable.space, R.drawable.sun, R.drawable.victorina, R.drawable.users,
            R.drawable.planets, R.drawable.spacebodies, R.drawable.space, R.drawable.sun, R.drawable.victorina, R.drawable.users,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_image_text_example);

        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(GridViewImageTextActivity.this,
                gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                Toast.makeText(GridViewImageTextActivity.this, "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });

    }
}