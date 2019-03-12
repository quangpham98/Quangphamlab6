package com.example.quangphamlab6;

import android.content.Context;
import android.graphics.Color;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CanvasFragment extends Fragment {
    ConstraintLayout canvasLayout;

    public CanvasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_canvas, container, false);
        //Define layout for fragment
        canvasLayout = v.findViewById(R.id.canvasLayout);
        return v;
    }

    public void updateBackgroundColor(int position) {
        String[] colors = {"MAGENTA", "WHITE", "GREEN", "RED", "BLUE", "YELLOW", "BLACK", "GRAY"};
        canvasLayout.setBackgroundColor(Color.parseColor(colors[position]));
    }

}

