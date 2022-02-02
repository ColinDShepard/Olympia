package com.example.olympia.Exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import com.example.olympia.CalorieCounter.AddFood;
import com.example.olympia.CalorieCounter.FoodItem;
import com.example.olympia.R;

import java.util.ArrayList;

public class PlanMenu extends AppCompatActivity {
    public ArrayList<Plan> plans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_menu);

        Button newPlanBtn = (Button)findViewById(R.id.idNewPlanBtn);
        newPlanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(PlanMenu.this, NewPlan.class);
            startActivity(intent);
            }
        });
    }
}