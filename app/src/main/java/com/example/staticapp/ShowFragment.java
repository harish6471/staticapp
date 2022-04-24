package com.example.staticapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ShowFragment extends Fragment {

    BarChart barChart;
    BarData barData;
    BarDataSet barDataSet;
    ArrayList barEntries;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.show, container, false);
        barChart = view.findViewById(R.id.bar_chart);

        getEntries();
        barDataSet = new BarDataSet(barEntries,"Results");
        barData = new BarData(barDataSet);
        barChart.setData(barData);
        barDataSet.setColor(Color.parseColor("#304567"));
        barDataSet.setValueTextColor(Color.BLACK);
//        barDataSet.setValueTextSize(18f);
        return view;
    }

    private void getEntries() {
        barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(0, 0));
        barEntries.add(new BarEntry(20, 70));
        barEntries.add(new BarEntry(35, 110));
        barEntries.add(new BarEntry(40, 150));
        barEntries.add(new BarEntry(45, 190));
        barEntries.add(new BarEntry(50, 250));
        barEntries.add(new BarEntry(55, 290));
        barEntries.add(new BarEntry(60, 300));
    }

}