package com.example.staticapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;


public class OutputFragment extends Fragment {


    String[] age = { "Under 30", "Under 40", "Under 50"};
    String[] salary = { "K 30- K 40", "K 40- K 50", "K 50- K 60"};
    String[]  gender = { "Male", "Female", "Rather not to say"};


    int i = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.output, container, false);

        Spinner spin = view. findViewById(R.id.s1);
        Spinner spin1 = view. findViewById(R.id.s2);
        Spinner spin2 = view. findViewById(R.id.s3);
        spin.getOnItemSelectedListener();
        spin1.getOnItemSelectedListener();
        spin2.getOnItemSelectedListener();

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter a1 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,age);
        ArrayAdapter a2 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,salary);
        ArrayAdapter a3 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,gender);
        a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(a1);
        spin1.setAdapter(a2);
        spin2.setAdapter(a3);
        // Inflate the layout for this fragment
        return view;
    }
}