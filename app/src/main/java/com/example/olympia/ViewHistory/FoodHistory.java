package com.example.olympia.ViewHistory;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.olympia.CalorieCounter.FoodItem;
import com.example.olympia.R;

import java.util.ArrayList;

public class FoodHistory extends Fragment {


    public FoodHistory() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food_history, container, false);

        ArrayList<FoodItem> foodList = new ArrayList<FoodItem>();
        foodList.add(new FoodItem());







        return view;
    }
}