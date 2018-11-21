package com.test.testing.solar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PlanetsActivity extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = {
            "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Плутон"

    } ;
    int[] gridViewImageId = {

            R.drawable.mercury, R.drawable.venus, R.drawable.earth, R.drawable.mars,
            R.drawable.jupiter, R.drawable.saturn, R.drawable.uranus, R.drawable.pluto,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_image_text_example);

        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(PlanetsActivity.this,
                gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                   @Override
                                                   public void onItemClick(AdapterView<?> parent, View view,
                                                                           int position, long id) {
                                                       if (position == 0) {
                                                           Intent intent = new Intent(PlanetsActivity.this, Mercury.class);
                                                           startActivity(intent);
                                                       } else if (position == 1){
                                                           Intent intent = new Intent(PlanetsActivity.this, Venus.class);
                                                           startActivity(intent);
                                                       } else if (position == 2){
                                                           Intent intent = new Intent(PlanetsActivity.this, Earth.class);
                                                           startActivity(intent);
                                                       }
                                                       else if (position == 3){
                                                           Intent intent = new Intent(PlanetsActivity.this, Mars.class);
                                                           startActivity(intent);
                                                       }
                                                       else if (position == 4){
                                                           Intent intent = new Intent(PlanetsActivity.this, Jupiter.class);
                                                           startActivity(intent);
                                                       }
                                                       else if (position == 5){
                                                           Intent intent = new Intent(PlanetsActivity.this, Saturn.class);
                                                           startActivity(intent);
                                                       }
                                                       else if (position == 6){
                                                           Intent intent = new Intent(PlanetsActivity.this, Uranus.class);
                                                           startActivity(intent);
                                                       }
                                                       else if (position == 7){
                                                           Intent intent = new Intent(PlanetsActivity.this, Pluto.class);
                                                           startActivity(intent);
                                                       }
                                                   }
                                               }
        );
    }
}